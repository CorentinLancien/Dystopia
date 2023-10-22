<template>
  <v-app id="login">
    <v-container class="fill-height align-center justify-center">
      <v-card
        class="mx-auto text-white"
        width="400"
        variant="text"
      >
      <v-card-item>
        <v-form fast-fail @submit.prevent>
          <v-text-field
            v-model="pseudo"
            label="Pseudo"
            :rules="PseudoRules"
          ></v-text-field>

          <v-text-field
            v-model="riotAccPseudo"
            label="Pseudo league of legends"
            :rules="RioatAccRules"
          ></v-text-field>

          <v-text-field
            v-model="email"
            label="Email"
            :rules="EmailRules"
            type="email"
          ></v-text-field>

          <v-text-field
            v-model="password"
            label="Mot de passe"
            :rules="PasswordRules"
            type="password"
          ></v-text-field>

          <v-text-field
            v-model="repetedPassword"
            label="Répéter le mot de passe"
            type="password"
            :rules="RepetedPasswordRules"
          ></v-text-field>
          <v-btn type="submit" variant="text" block class="mt-2">Submit</v-btn>
        </v-form>
      </v-card-item>
      </v-card>
    </v-container>
  </v-app>
</template>

<script>
export default {
  name: 'LoginComponent',
  components: {
  },
  data: () => ({
    pseudo: '',
    riotAccPseudo: '',
    email: '',
    password: '',
    repetedPassword: '',
    PseudoRules: [
        value => {
          if (value?.length > 3) return true

          return 'Le pseudo doit être supérieur à 3 caractères.'
        },
      ],
      EmailRules: [
        value => {
          if (value?.length > 3) return true

          return 'First name must be at least 3 characters.'
        },
      ],
      PasswordRules: [
        value => {
          if (value?.length > 3) return true

          return 'First name must be at least 3 characters.'
        },
      ],
      RepetedPasswordRules: [
        value => {
          if (value?.length > 3) return true

          return 'First name must be at least 3 characters.'
        },
      ],
  }),
  methods: {
  },  
  mounted () {
  }
}
</script>

<style scoped>
#login {
  background: url("../assets/dystopia-bg.jpg") no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.v-card{
  position: relative;
  overflow: hidden;
  border-radius: 10px;
  display: grid;
}
.v-form {
  position: relative;
  justify-content:space-around;
  align-items:start;
  z-index: 10;
}
.v-card::before {
  content: '';
  position: absolute;
  width: 150px;
  height: 140%;
  background: linear-gradient(#da843c, #1beee7);
  animation: animate 4s linear infinite;
  justify-self: center;
  align-self: center;
}
.v-card::after{
  content: '';
  position: absolute; 
  background: radial-gradient(#07253d, #0f0f2e);  
  inset: 4px;
}
@keyframes animate
{
  0%
  {
    transform: rotate(0deg);
  }
  100%
  {
    transform: rotate(360deg);
  }
}
</style>