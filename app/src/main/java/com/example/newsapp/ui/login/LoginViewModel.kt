package com.example.newsapp.ui.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel : ViewModel() {

 private val _uiState = MutableStateFlow(LoginUiState())
 val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

 fun onEmailChange(value: String) {
  _uiState.value = _uiState.value.copy(email = value)
 }

 fun onPasswordChange(value: String) {
  _uiState.value = _uiState.value.copy(password = value)
 }

 fun login(onSuccess: () -> Unit) {
  val email = _uiState.value.email.trim()
  val password = _uiState.value.password.trim()

  if (email == "admin@gmail.com" && password == "123456") {
   _uiState.value = _uiState.value.copy(errorMessage = null)
   onSuccess()
  } else {
   _uiState.value = _uiState.value.copy(errorMessage = "Credenciales incorrectas")
  }
 }


 data class LoginUiState(
  val email: String = "",
  val password: String = "",
  val errorMessage: String? = null
 )

}