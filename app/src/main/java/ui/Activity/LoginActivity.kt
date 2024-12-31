<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context="ui.Activity.LoginActivity">

<TextView
android:id="@+id/tv_login_title"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="16dp"
android:text="Login"
android:textSize="24sp"
android:textStyle="bold"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent" />

<EditText
android:id="@+id/et_email"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:hint="Email or Username"
android:inputType="textEmailAddress"
android:layout_marginTop="16dp"
app:layout_constraintTop_toBottomOf="@id/tv_login_title"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintWidth_percent="0.8" />

<EditText
android:id="@+id/et_password"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:hint="Password"
android:inputType="textPassword"
android:layout_marginTop="16dp"
app:layout_constraintTop_toBottomOf="@id/et_email"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintWidth_percent="0.8" />

<Button
android:id="@+id/btn_login"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Login"
android:layout_marginTop="24dp"
app:layout_constraintTop_toBottomOf="@id/et_password"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent" />

<TextView
android:id="@+id/tv_register"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Don't have an account? Register"
android:textSize="14sp"
android:textColor="@color/teal_700"
android:layout_marginTop="16dp"
android:clickable="true"
android:focusable="true"
app:layout_constraintTop_toBottomOf="@id/btn_login"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
