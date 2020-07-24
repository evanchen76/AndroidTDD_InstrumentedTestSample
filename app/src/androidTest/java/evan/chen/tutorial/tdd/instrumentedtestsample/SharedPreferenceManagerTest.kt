package evan.chen.tutorial.tdd.instrumentedtestsample

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SharedPreferenceManagerTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        val key = "User_Id"
        val value = "A123456789"

        val sharedPreferenceManager: ISharePreferenceManager = SharedPreferenceManager(appContext)
        sharedPreferenceManager.saveString(key, value)

        val valueFromSP = sharedPreferenceManager.getString(key)

        //將SharedPreference取出，驗證結果
        Assert.assertEquals(value, valueFromSP)

    }
}
