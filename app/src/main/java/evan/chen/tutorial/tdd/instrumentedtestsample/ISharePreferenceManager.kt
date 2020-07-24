package evan.chen.tutorial.tdd.instrumentedtestsample

import android.content.Context

interface ISharePreferenceManager {
    val context: Context
    fun saveString(key: String, value: String)
    fun getString(key: String): String
}