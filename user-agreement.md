# Privacy Policy and User Agreement

## 1. Introduction
This privacy policy and user agreement aim to explain CodeBook's data processing, security measures, and user usage guidelines. Please read carefully. Your use of this application constitutes your agreement to the terms of this policy and agreement.

We formulate this policy in accordance with relevant laws and regulations to ensure that your legitimate rights and interests are fully protected.

## 2. Data Security Mechanisms
CodeBook uses multiple security mechanisms to protect your data:

- All sensitive data is encrypted using the AES-256-GCM encryption algorithm. This algorithm is widely recognized as a high-strength encryption standard, effectively preventing data from being stolen or tampered with during storage.
- Encryption keys are securely stored and protected by the Android KeyStore system. The Android KeyStore system provides hardware-level security, ensuring that keys are not accessed without authorization.
- The application supports password authentication and biometric authentication.
- Biometric authentication uses the BiometricPrompt API to unlock KeyStore keys. Data encryption and decryption are performed entirely within the operating system's hardware space and do not enter the application's memory.
- Password authentication derives keys using the PBKDF2 key derivation function with a salt, generating different hash values even for the same password, ensuring data security.
- All data is stored locally on the device, and we do not engage in any network interactions. This means your data is not at risk of being leaked due to network transmission.

> ### Important Notice
> Due to the high-security encryption mechanisms used:
> 
> - If you choose password authentication: forgetting your password will result in data being unrecoverable. The password is key to deriving the encryption key, and once forgotten, we cannot recover the key through other means.
> - If you choose biometric authentication: deleting system biometric data may result in key loss. Biometric data is closely tied to the encryption key, and deleting system biometric data will prevent the application from unlocking and retrieving the key.
> - Data loss in these cases is unrecoverable because we do not store any information that can be used for recovery. This is to maximize your data security and prevent third parties from accessing your data through recovery methods.

## 3. Authentication and Encryption Mechanisms

We provide two authentication methods to protect your data:

### 3.1 Password Authentication

- Passwords are salted using the PBKDF2-HMAC-SHA256 algorithm. This algorithm is widely used for password encryption, effectively resisting brute-force and dictionary attacks.
- We use 120,000 iterations to enhance password strength. More iterations increase the computational resources and time required to crack the password.
- Each user uses a unique random salt. The uniqueness of the salt ensures that even if different users set the same password, their encrypted hash values will differ.
- Password hashes and salt values are stored in EncryptedSharedPreferences. EncryptedSharedPreferences provides additional encrypted storage to further ensure the security of password-related information.
- A 256-bit AES encryption key is derived from the password. This key is used for subsequent encryption and decryption of sensitive data.
- We do not store your encryption key; the key is re-derived from the master password each time the application starts. This measure prevents the security risks associated with long-term storage of keys on the device.

### 3.2 Biometric Authentication

- Biometric authentication is performed using the Android BiometricPrompt API. This API undergoes rigorous security audits to ensure the security and reliability of the biometric process.
- Encryption keys are stored in the Android KeyStore system. As mentioned earlier, the Android KeyStore provides robust security.
- Keys are tied to biometric data and require authentication for each use. This ensures that only users who pass biometric verification can access encrypted data.
- The authentication validity period is 10 minutes, after which re-authentication is required. This period balances convenience and security, reducing unnecessary authentication operations while ensuring data is not left unprotected for extended periods.
- Keys never leave the KeyStore system and cannot be exported. This prevents keys from being stolen by malware or exported for illegal purposes.
- Encryption and decryption are handled by the operating system's secure hardware. Utilizing the device's secure hardware for encryption and decryption further enhances security and performance.

## 4. Data Encryption Scope

The following information will be encrypted and stored in our database:

- Password fields for application accounts.
- TOTP secrets.
- Bank card numbers and CVV codes.
- ID card numbers.
- SSH private keys and passphrases.

The following information is stored in plaintext in our database:

- Application and account names. This information is used for identification and management of your records, does not involve sensitive data, and is stored in plaintext for your convenience.
- Bank names and cardholder names. This information is relatively less sensitive, but we still take appropriate security measures to protect its storage and use.
- ID card holder names and address information. Similarly, this information is subject to strict security controls during use and storage.
- SSH key names and public keys. Public keys do not involve sensitive information, and their names are used to identify and manage SSH keys.
- Remarks and other information. Remarks are filled in by you, and we respect your privacy, using and managing them only with your authorization.

## 5. Data Decryption Mechanisms

Data decryption is triggered under the following circumstances:

- When entering the application's TOTP main page, edit page, or detail page, we need to decrypt the TOTP secret to display data and generate verification codes.
- When viewing sensitive information such as passwords, bank cards, or ID cards. When you need to view this sensitive information, the application will perform decryption after ensuring your identity verification is successful.
- When using the autofill service. To facilitate the use of stored sensitive information in other applications, the application will decrypt and fill the data after your authentication is successful.
- When exporting data. When you need to export data to other devices or create backups, the application decrypts the data and exports it in a specific encrypted format.

Security measures for the decryption process:

- User identity is verified each time the application is entered. This ensures that only legitimate users can trigger decryption.
- Decryption is performed in memory and not written to disk. This reduces the risk of sensitive data remaining on disk. Once the application is closed or the device is restarted, sensitive data in memory is cleared.
- GCM mode is used to ensure data integrity. GCM mode not only encrypts data but also verifies whether data has been tampered with during transmission and decryption.
- Sensitive data in memory is immediately cleared if decryption fails. This prevents sensitive data leakage due to decryption failures.

## 6. Autofill Service

The autofill service is currently in the testing phase and helps you automatically fill in passwords when required by other applications:

- Recognizes supported field types:
  - Username and password fields. Helps you quickly fill in login information for various applications.

- Security measures:
  - Authentication is required before each fill. Ensures that the filling operation is authorized by you.
  - Filled data is decrypted and directly passed to the system. This reduces the risk of data exposure during transmission.
  - Decrypted data is not saved. After filling, the application does not retain decrypted sensitive data.
  - Will not fill into untrusted applications. We use a package name binding mechanism to prevent sensitive data from being filled into irrelevant applications.

## 7. Data Backup and Recovery

CodeBook supports backup and recovery of all data stored in the application. Below are our protective measures for backups:

- Since encryption keys cannot be exported, all data will be temporarily decrypted to generate a backup file during data export.
- Backup files are encrypted using an independent encryption key. Even if the backup file is obtained by others, the data inside cannot be decrypted without the correct encryption key.
- Providing the encryption key used during backup is required to restore data. Only users with the correct key can successfully restore data.
- Supports importing password data from the Chrome browser. This facilitates integrating existing password information, but strict security verification is also performed during the import process.

> ### Special Notes
> Regarding data export and import:
> 
> - CodeBook does not currently support exporting data stored in the application to a universal format for import by other applications.
> - CodeBook does not currently support exporting data for a specific category separately, only supports exporting all data at once.
> - CodeBook does not currently support exporting/importing without setting a password. This is to prevent your sensitive data from being read by malicious applications after export.

## 8. Device Security Requirements

To ensure your data security, please note the following:

- Ensure that your device is not rooted or the bootloader is unlocked. Rooting or unlocking the bootloader may disable some device security mechanisms, increasing the risk of data leakage.
- Ensure that your device is free from malicious applications or viruses. Malicious applications and viruses may steal your data or compromise the application's security mechanisms.
- Update system security patches promptly. System security patches typically fix known security vulnerabilities, maintaining device security.
- It is not recommended to run CodeBook on devices with security risks. If your device has been compromised or has unfixed security vulnerabilities, using this application may lead to data leakage.

> ### Special Notes
> Regarding device security:
> 
> - CodeBook does not actively detect device security status. We rely on your self-management and maintenance of device security.
> - Using the application on an insecure device may lead to data leakage risks. Even if the application itself implements multiple security measures, device-level security issues may bypass the application's protection.
> - Users must bear the risk of using an insecure device. Please ensure your device is secure before using this application.

## 9. User Agreement

By using this application, you agree to:

- Take responsibility for your password management. You must properly keep your set password and avoid forgetting or leaking it.
- Safeguard your authentication credentials (password or biometric data). Do not disclose your password to others, and protect your device's biometric functions from misuse.
- Understand and accept the risk of unrecoverable data. As mentioned earlier, due to the nature of the encryption mechanism, data loss may be unrecoverable in some cases.
- Not attempt to crack or tamper with the application's security mechanisms. Any attempt to crack or tamper with the application's security mechanisms is a violation of the user agreement and may be illegal.
- Comply with relevant laws and regulations when using this application. Your use of this application should comply with the relevant laws and regulations of your country or region.
- Back up important data regularly. It is recommended that you back up data regularly to prevent data loss due to device failure or other reasons.
- Export data before changing devices. Ensure that you can successfully migrate data to a new device when changing devices.

## 10. Disclaimer

We are not responsible for the following situations:

- Data loss due to forgotten passwords. Since passwords are set and kept by users, we cannot provide password recovery services and are not responsible for data loss due to forgotten passwords.
- Data loss due to device reset or replacement. Device reset or replacement is a user's own operation, and please ensure that you have backed up your data before operating.
- Data corruption due to system failures. Although we have taken various measures to ensure data security, system failures may be beyond our control.
- Data leakage due to user operation errors. Data leakage caused by operational errors such as disclosing passwords to others or using the application in an insecure environment is the user's responsibility.
- Third-party application attacks or cracks on this application. We will do our best to prevent third-party attacks, but we are not responsible for data leakage or other losses caused by third-party attacks.
- Data leakage caused by use on insecure devices. As mentioned earlier, device security is an important prerequisite for data security, and the risk of using this application on insecure devices is borne by the user.
- Due to any other form, your data may be lost, leaked, or unrecoverable.

> ### Important Notes
> Regarding data recovery:
> 
> - If you lose your password or encryption key, the developer cannot provide any recovery assistance. This is determined by the application's encryption mechanism. We do not store any information that can be used to decrypt data.
> - This is because CodeBook does not store any information that can be used to decrypt data. We are committed to protecting your data security and do not retain any recovery information that may be abused.
> - Please keep your password and backups safe. It is recommended to set a strong password and back up data regularly to secure storage media.

## 11. Policy and Agreement Changes

We may change this privacy policy and user agreement according to changes in laws and regulations, technology development, or business needs. Since CodeBook cannot interact with the Internet, the revised policy and agreement will be published in the new version of the application. If you continue to use this application after the policy and agreement changes, it means that you agree to accept the changed terms.

## 12. Acknowledgments

Finally, thank you for using the CodeBook application. If you have any questions or suggestions during use, please feel free to email xuanran0808@gmail.com.
