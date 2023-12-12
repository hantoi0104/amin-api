package offerlinks.jpk.lss.adminapi.presentation.dto.plandelete

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime
import java.util.UUID

@Schema(description = "プラン情報削除リクエスト")
data class PlanDeleteRequestDto (
    @get:Schema(
        description = "プランID",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val planId: UUID?,

    @get:Schema(
        description = "ホテルID",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val hotelId: UUID?,

    @get:Schema(
        description = "最終更新日時",
        required = true
    )
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @field:NotNull
    val updatedDatetime: LocalDateTime?

)