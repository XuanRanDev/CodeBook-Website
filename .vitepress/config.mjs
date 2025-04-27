import { defineConfig } from 'vitepress'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  title: "CodeBook",
  description: "A secure password manager",

  locales: {
    root: {
      label: 'English',
      lang: 'en',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/' },
          { text: 'Privacy Policy', link: '/privacy-policy' },
          { text: 'User Agreement', link: '/user-agreement' }
        ],
        
        sidebar: [
          {
            text: 'Introduction',
            items: [
              { text: 'What is CodeBook?', link: '/introduction/what-is-codebook' },
              { text: 'Security Features', link: '/introduction/security-features' },
              { text: 'Getting Started', link: '/introduction/getting-started' }
            ]
          },
          {
            text: 'Features',
            items: [
              { text: 'Password Management', link: '/features/password-management' },
              { text: 'Data Encryption', link: '/features/data-encryption' },
              { text: 'Auto-fill Service', link: '/features/auto-fill' },
              { text: 'Backup & Restore', link: '/features/backup-restore' }
            ]
          }
        ],

        footer: {
          message: 'Released under the MIT License.',
          copyright: 'Copyright © 2024-present CodeBook'
        }
      }
    },
    
    zh: {
      label: '简体中文',
      lang: 'zh-CN',
      link: '/zh/',
      themeConfig: {
        nav: [
          { text: '首页', link: '/zh/' },
          { text: '隐私政策', link: '/zh/privacy-policy' },
          { text: '用户协议', link: '/zh/user-agreement' }
        ],
        
        sidebar: [
          {
            text: '介绍',
            items: [
              { text: '什么是 CodeBook?', link: '/zh/introduction/what-is-codebook' },
              { text: '安全特性', link: '/zh/introduction/security-features' },
              { text: '快速开始', link: '/zh/introduction/getting-started' }
            ]
          },
          {
            text: '功能特性',
            items: [
              { text: '密码管理', link: '/zh/features/password-management' },
              { text: '数据加密', link: '/zh/features/data-encryption' },
              { text: '自动填充服务', link: '/zh/features/auto-fill' },
              { text: '备份与恢复', link: '/zh/features/backup-restore' }
            ]
          }
        ],

        footer: {
          message: '基于 MIT 许可发布',
          copyright: 'Copyright © 2024-present CodeBook'
        }
      }
    }
  },

  themeConfig: {
    // Logo in the navigation bar
    logo: '/logo.png',

    // Social links
    socialLinks: [
      { icon: 'github', link: 'https://github.com/yourusername/codebook' }
    ]
  }
})
