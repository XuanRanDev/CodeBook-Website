# Security Features

CodeBook employs a multi-layered security protection mechanism to ensure your data safety.

## Encryption Technology

### AES-256-GCM Encryption
- Industry-recognized strong encryption standard
- Supports authenticated encryption to detect data tampering
- Independent encryption key for each data item
- Encryption process performed in secure hardware

### Key Protection
- Master key stored in Android KeyStore system
- Hardware-level key protection
- Prevention of key extraction and export
- Keys bound to device security

### PBKDF2 Key Derivation
- High-strength key derivation function
- Salt processing prevents rainbow table attacks
- 120,000 iterations for enhanced security
- Independent salt value for each user

## Authentication Mechanism

### Master Password Protection
- Enforced strong password policy
- Password hashing with salt
- Prevention of brute force attacks
- Password retry limit

### Biometric Authentication
- Supports fingerprint and other biometrics
- Uses system-level BiometricPrompt
- Biometric data never leaves device
- Authentication processed in TEE

### Session Management
- Automatic session timeout
- Auto-lock when running in background
- Optional lock on app switch
- Manual lock support

## Data Isolation

### Application Sandbox
- Strict application data isolation
- Private storage space protection
- Prevention of access by other apps
- System-level permission control

### Memory Protection
- Immediate clearing of sensitive data after use
- Prevention of memory data leaks
- Protection against memory dump attacks
- Regular memory cleanup

### Temporary File Handling
- Secure temporary file creation
- Immediate deletion after use
- File overwrite before deletion
- Prevention of data recovery

## Auto-fill Security

### Application Verification
- Target app package name verification
- Prevention of malicious app phishing
- Auto-fill permission control
- User confirmation mechanism

### Data Transfer
- Secure inter-process communication
- Encrypted data transfer protection
- Single-use session keys
- Prevention of man-in-the-middle attacks

## Backup Protection

### Encrypted Backup
- Separate encryption for backup files
- User-defined backup keys
- Support for encrypted export/import
- Prevention of backup file leaks

### Secure Transfer
- Local backup file encryption
- No cloud backup support
- Prevention of network transfer leaks
- User control of backup files

## Development Practices

### Code Security
- Open source code audit
- Adherence to secure coding standards
- Regular security reviews
- Timely security fixes

### Update Mechanism
- Timely security patch releases
- Forced update mechanism
- Version integrity verification
- Application signature verification

## Best Practice Recommendations

### Device Requirements
- Avoid use on rooted devices
- Keep system up to date
- Install security protection software
- Exercise caution with permissions

### Usage Recommendations
- Regular master password changes
- Enable biometric authentication
- Regular backup of important data
- Prompt application locking

### Important Notes
- Never share master password
- Protect backup file security
- Beware of phishing attacks
- Maintain vigilance 