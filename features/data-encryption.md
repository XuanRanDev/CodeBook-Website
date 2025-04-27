# Data Encryption

CodeBook employs industry-leading encryption technology to provide the highest level of protection for your sensitive data.

## Encryption Technology

### AES-256-GCM
- 256-bit key length
- GCM authenticated encryption mode
- Prevention of data tampering
- Independent encryption per data item

### Key Management
- Android KeyStore system protection
- Hardware-level secure storage
- TEE environment processing
- Keys never exported

### Key Derivation
- PBKDF2-HMAC-SHA256 algorithm
- 120,000 iterations
- Random salt values
- Rainbow table attack prevention

## Encryption Scope

### Sensitive Data
- Account passwords
- Bank card information
- ID card information
- Private key data
- TOTP keys

### Metadata Protection
- Application name encryption
- Username protection
- Notes encryption
- Tag information protection

### Temporary Data
- Clipboard protection
- Memory data encryption
- Cache encryption
- Secure deletion

## Encryption Process

### Data Writing
1. Generate random key
2. Encrypt with master key
3. Encrypt actual data
4. Store encrypted data

### Data Reading
1. Authentication
2. Decrypt data key
3. Decrypt actual data
4. Secure display

### Data Deletion
- Secure key erasure
- Original data overwrite
- Memory cleanup
- Deletion verification

## Security Mechanisms

### Access Control
- Mandatory authentication
- Session management
- Permission control
- Operation auditing

### Integrity Protection
- Data signatures
- Hash verification
- Version control
- Tampering detection

### Isolation Protection
- Application sandbox
- Process isolation
- Memory isolation
- Storage isolation

## Backup Encryption

### Backup Files
- Independent encryption keys
- Full backup encryption
- Keys not included in backup
- Unauthorized recovery prevention

### Import/Export
- Encrypted transfer
- Format validation
- Integrity checking
- Secure import

### Key Backup
- No key backup support
- Master password non-recoverable
- User key management
- Security guidelines

## Technical Specifications

### Encryption Algorithms
- AES-256-GCM
- PBKDF2-HMAC-SHA256
- SHA-512
- Secure random number generation

### Key Lengths
- 256-bit master key
- 256-bit data keys
- 128-bit IV
- 128-bit authentication tag

### Security Standards
- FIPS 140-2
- NIST standards
- OWASP guidelines
- CWE/SANS Top 25

## Best Practices

### Password Management
- Use strong master password
- Regular password changes
- Avoid password reuse
- Secure password storage

### Data Protection
- Prompt app locking
- Regular data backups
- Secure data cleanup
- Usage environment awareness

### Security Awareness
- Understand security risks
- Maintain vigilance
- Follow security guidelines
- Keep app updated

## Common Issues

### Key Loss
- Data non-recoverable
- Need for reset
- Backup restoration
- Preventive measures

### Performance Impact
- Encryption performance optimization
- Wait time reduction
- Resource usage control
- Battery consumption optimization

### Compatibility
- System version requirements
- Hardware requirements
- Backup compatibility
- Import/export formats

## More Information

- [Security Features Details](/introduction/security-features)
- [Password Management Guide](/features/password-management)
- [Backup & Restore Tutorial](/features/backup-restore)
- [FAQ](/faq) 