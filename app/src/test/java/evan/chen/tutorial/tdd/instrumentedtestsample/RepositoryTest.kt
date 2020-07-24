package evan.chen.tutorial.tdd.instrumentedtestsample

import org.junit.Test
import org.mockito.Mockito.*

class RepositoryTest {

    @Test
    fun saveUserId() {

        val mockSharedPreferenceManager = mock(ISharePreferenceManager::class.java)

        val userId = "A1234567"
        val preKey = "USER_ID"

        val repository = Repository(mockSharedPreferenceManager)

        //Act call repository.saveUserId()
        repository.saveUserId(userId)

        //Assert
        verify(mockSharedPreferenceManager).saveString(preKey, userId)
    }
}