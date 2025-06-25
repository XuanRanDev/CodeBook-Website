
import java.security.SecureRandom
import java.util.*
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec

object AESCryptGCM {
    private const val ALGORITHM = "AES/GCM/NoPadding"
    private const val KEY_SIZE = 256 // bits
    private const val IV_SIZE = 12 // bytes
    private const val TAG_SIZE = 128 // bits
    private const val ITERATION_COUNT = 150_000
    private const val SALT_LENGTH = 32 // bytes

    fun encrypt(password: String, data: String): String {
        try {
            val salt = ByteArray(SALT_LENGTH)
            SecureRandom().nextBytes(salt)

            val key = generateKey(password, salt)

            val iv = ByteArray(IV_SIZE)
            SecureRandom().nextBytes(iv)

            val cipher = Cipher.getInstance(ALGORITHM)
            val spec = GCMParameterSpec(TAG_SIZE, iv)
            cipher.init(Cipher.ENCRYPT_MODE, key, spec)

            val encrypted = cipher.doFinal(data.toByteArray(Charsets.UTF_8))

            // Combine salt + iv + encrypted
            val combined = ByteArray(salt.size + iv.size + encrypted.size)
            System.arraycopy(salt, 0, combined, 0, salt.size)
            System.arraycopy(iv, 0, combined, salt.size, iv.size)
            System.arraycopy(encrypted, 0, combined, salt.size + iv.size, encrypted.size)

            return Base64.getEncoder().encode(combined).toString()
        } catch (e: Exception) {
            throw RuntimeException("AES-GCM encryption failed", e)
        }
    }

    fun decrypt(password: String, encryptedData: String): String {
        try {
            val decoded = Base64.getDecoder().decode(encryptedData)

            val salt = decoded.copyOfRange(0, SALT_LENGTH)
            val iv = decoded.copyOfRange(SALT_LENGTH, SALT_LENGTH + IV_SIZE)
            val cipherText = decoded.copyOfRange(SALT_LENGTH + IV_SIZE, decoded.size)

            val key = generateKey(password, salt)

            val cipher = Cipher.getInstance(ALGORITHM)
            val spec = GCMParameterSpec(TAG_SIZE, iv)
            cipher.init(Cipher.DECRYPT_MODE, key, spec)

            val decrypted = cipher.doFinal(cipherText)
            return String(decrypted, Charsets.UTF_8)
        } catch (e: Exception) {
            throw RuntimeException("AES-GCM decryption failed", e)
        }
    }

    private fun generateKey(password: String, salt: ByteArray): SecretKey {
        val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256")
        val spec = PBEKeySpec(password.toCharArray(), salt, ITERATION_COUNT, KEY_SIZE)
        val tmp = factory.generateSecret(spec)
        return SecretKeySpec(tmp.encoded, "AES")
    }
}


fun main() {
    println(AESCryptGCM.decrypt("Your Password", "have been Encrypted Data"))
}
