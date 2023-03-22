<template>
  <v-app>
    <LoginComponent v-if="!$store.state.isConnected"></LoginComponent>
    <div v-else>
      <nav>
        <router-link to="/">Home</router-link> |
        <router-link to="/register">Register</router-link>
      </nav>
      <router-view/>
  </div>
  </v-app>
</template>

<script>
import LoginComponent from '@/components/LoginComponent.vue';
export default {

  name: 'App',
  components: {
    LoginComponent
  },
  data: () => ({

  }),
  methods: {
  },  
  mounted () {
  }
}
</script>


<style>

@import url('https://fonts.googleapis.com/css2?family=Orbitron&display=swap');
#app {
  
  font-family: 'Orbitron';
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
