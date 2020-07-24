package evan.chen.tutorial.tdd.instrumentedtestsample

import android.content.Context

class Repository(val sharedPreferenceManager: ISharePreferenceManager) {

    fun saveUserId(id: String) {
        sharedPreferenceManager.saveString("USER_ID", id)
    }
}