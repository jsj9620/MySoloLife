package com.seungjun.mysolelife.utils

import com.google.firebase.auth.FirebaseAuth

class FBAuth {
    companion object {
        private lateinit var auth : FirebaseAuth

        fun getUid() : String {
            auth = FirebaseAuth.getInstance()
            return auth.currentUser?.uid.toString()
        }
    }
}