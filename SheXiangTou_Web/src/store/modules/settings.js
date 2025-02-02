import variables from '@/assets/styles/element-variables.scss'
import defaultSettings from '@/settings'

const { sideTheme, showSettings, tagsView, fixedHeader, sidebarLogo } = defaultSettings

const state = {
  theme: '#13ce66',
  sideTheme: sideTheme,
  showSettings: showSettings,
  tagsView: false,
  fixedHeader: fixedHeader,
  sidebarLogo: sidebarLogo
}

const mutations = {
  CHANGE_SETTING: (state, { key, value }) => {
    if (state.hasOwnProperty(key)) {
      state[key] = value
    }
  }
}

const actions = {
  changeSetting({ commit }, data) {
    commit('CHANGE_SETTING', data)
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}

