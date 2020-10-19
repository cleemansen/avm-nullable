import com.squareup.moshi.Moshi
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.Test

class SerializeTest {

    private val moshi = Moshi.Builder().build()

    @Test
    fun `should write null value as title`() {
        // prepare
        val expected = Issue.builder().id("126").build()

        // execute
        val actual = Issue.jsonAdapter(moshi).toJson(expected)

        // verify
        assertThat(actual).isEqualTo("""{"id":"126","title":null}""")
    }

}