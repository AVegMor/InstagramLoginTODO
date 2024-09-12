package com.example.instagramlogin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {

    Box(
        Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Header(Modifier.align(Alignment.TopEnd))
        Body(Modifier.align(Alignment.Center))
        Footer(Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun Header(modifier: Modifier) {
    //X cerrar aplicacion

}

@Composable
fun Body(modifier: Modifier) {
    //Imagen de Instagram
    //Email
    //Password
    //ForgotPassword
    //LoginButton
    //LoginDivider
    //LoginSocial
}

@Composable
fun ImageLogo(modifier: Modifier) {
    //Instagram imagen
}

@Composable
fun Email(email: String, onTextChanged: (String) -> Unit) {
    //Email
}

@Composable
fun Password(password: String, onTextChanged: (String) -> Unit) {
    //Password
}
@Composable
fun ForgotPassword(modifier: Modifier) {
    //ForgotPassword
}

@Composable
fun LoginButton(isLoginEnabled: Boolean) {
    //Log in
}

@Composable
fun LoginDivider() {
    //--------- OR -----------
}

@Composable
fun LoginSocial() {
    //FB imagen
    //Iniciar sesión con Facebook
}

@Composable
fun Footer(modifier: Modifier) {
    //SignUp()

}

@Composable
fun SignUp() {
    //Don't have an account?
    //Sign Up
}

fun EnableLogin(email: String, password: String): Boolean {
    //Devuelve true si email es email válido y password tiene más de 6 caracteres
    return true;
}


fun onTextChanged(it: String) {

}