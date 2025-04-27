# Privacy Policy

## Introduction

CodeBook application implements strict measures in data processing, security protection, and user usage specifications. This privacy policy aims to explain how we protect your data security. By using this application, you agree to the terms of this policy.

## Data Security Mechanism

CodeBook employs multiple security mechanisms to protect your data:

- **Strong Encryption**: All sensitive data is encrypted using AES-256-GCM algorithm
- **Hardware-level Security**: Encryption keys are securely stored and protected by Android KeyStore system
- **Dual Authentication**: Supports both password and biometric authentication methods
- **Secure Biometrics**: Uses BiometricPrompt API with data processing in OS hardware space
- **Local Storage**: All data is stored locally on device with no network interaction

## Data Encryption Scope

### Encrypted Data
- Application account passwords
- TOTP keys
- Bank card numbers and CVV codes
- ID card numbers
- SSH private keys and passphrases

### Plaintext Data
- Application names and account names
- Bank names and cardholder names
- ID card holder names and address information
- SSH key names and public keys
- Notes and remarks

## Auto-fill Service

Currently in testing phase, main features include:

- **Supported Fields**: Username and password fields
- **Security Measures**:
  - Authentication required before each auto-fill
  - Decrypted data directly passed to system
  - No storage of decrypted data
  - No filling to untrusted applications

## Backup and Recovery

- Supports complete data backup and recovery
- Backup files encrypted with separate encryption keys
- Correct encryption key required for data recovery
- Supports password import from Chrome browser

## Device Security Requirements

To ensure data security, we recommend:

- Ensure device is not rooted or bootloader unlocked
- Ensure device is free from malicious apps or viruses
- Keep system security patches up to date
- Avoid running CodeBook on devices with security risks

## Disclaimer

We are not responsible for:

- Data loss due to forgotten passwords
- Data loss due to device reset or replacement
- Data corruption due to system failures
- Data leaks due to user operation errors
- Third-party attacks or hacks of the application
- Data leaks from using on insecure devices

## Contact Us

If you have any questions or suggestions while using the application, please contact: xuanran0808@gmail.com 