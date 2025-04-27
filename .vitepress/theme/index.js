import DefaultTheme from 'vitepress/theme'
import { useData, inBrowser } from 'vitepress'
import { watchEffect } from 'vue'

export default {
  ...DefaultTheme,
  setup() {
    const { lang } = useData()
    
    // 监听语言变化
    watchEffect(() => {
      if (inBrowser) {
        document.documentElement.lang = lang.value
      }
    })
  }
} 