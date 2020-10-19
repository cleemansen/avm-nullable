import com.google.auto.value.AutoValue
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

@JsonClass(generateAdapter = true, generator = "avm")
@AutoValue
abstract class Issue {

    abstract fun getId(): String

    @Nullable
    abstract fun getTitle(): String?

    abstract fun toBuilder(): Builder

    @AutoValue.Builder
    abstract class Builder {
        abstract fun id(value: String): Builder
        abstract fun title(value: String?): Builder
        abstract fun build(): Issue
    }

    companion object {
        fun builder(): Builder = AutoValue_Issue.Builder()

        @JvmStatic
        fun jsonAdapter(moshi: Moshi): JsonAdapter<Issue> {
            return IssueJsonAdapter(moshi).serializeNulls()
        }
    }
}