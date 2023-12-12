package offerlinks.jpk.lss.adminapi.presentation.dto.planupdate

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.time.LocalDateTime
import java.util.UUID
import kotlin.math.min

data class PlanUpdateRequestDto (
    @get:Schema(
        description = "プランID",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val planId: UUID,

    @get:Schema(
        description = "ホテルID",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val hotelId: UUID,

    @get:Schema(
        description = "プラン名",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field: Size(max = 200)
    val planName: String,

    @get:Schema(
        description = "プラン名（英字）",
        required = true,
        maxLength = 200
    )
    @field:NotNull
    @field:NotBlank
    @field: Size(max = 200)
    @field:Pattern(
        regexp = "(^[A-Za-z]+\$)",
        message = "アルファベットの文字で入力してください。"
    )
    val planNameEn: String,

    @get:Schema(
        description = "プランコード",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    @field: Size(max = 80)
    val planCode: String,

    @get:Schema(
        description = "表示",
        required = true,
        minLength = 1,
        maxLength = 1
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min = 1, max = 1)
    val isActive: String,

    @get:Schema(
        description = "販売開始日時",
        format = "yyyy-MM-dd HH:mm",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @field:Size(min= 16, max = 16)
    val startDate: LocalDateTime,

    @get:Schema(
        description = "販売終了日時",
        format = "yyyy-MM-dd HH:mm",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @field:Size(min= 16, max = 16)
    val endDate: LocalDateTime?,

    @get:Schema(
        description = "販売対象",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val salesChannel: String,

    @get:Schema(
        description = "食事",
        required = true,
        minLength = 1, maxLength = 1
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min =1 , max =1)
    val meal: String,

    @get:Schema(
        description = "リゾートフィー",
        required = true,
        minLength = 1, maxLength = 1
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(min =1 , max =1)
    val resortFee: String?,

    @get:Schema(
        description = "プラン説明",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val planDescription: String,

    @get:Schema(
        description = "プラン優先順位・名寄せID",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val planAggregationId: String,

    @get:Schema(
        description = "名寄せ内優先順位",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val planAggregationPriority: String,

    @get:Schema(
        description = "最短泊数"
    )
    val minNumberOfNights: String?,

    @get:Schema(
        description = "最長泊数"
    )
    val maxNumberOfNights: String?,

    @get:Schema(
        description = "手仕舞日",
        format = "yyyy-MM-dd"
    )
    @JsonFormat(pattern = "yyyy-MM-dd")
    val closeDay: String?,

    @get:Schema(
        description = "通貨"
    )
    @field:Size(min= 3, max = 3)
    val currency: String?,

    @get:Schema(
        description = "最小定員"
    )
    val minCapacity: String?,

    @get:Schema(
        description = "最大定員"
    )
    val maxCapacity: String?,

    @get:Schema(
        description = "標準定員"
    )
    val standardCapacity: String?,

    @get:Schema(
        description = "大人定員"
    )
    val adultCapacity: String?,

    @get:Schema(
        description = "添寝可能",
        minLength = 1, maxLength = 1
    )
    @field:Size(min= 1, max = 1)
    val coSleeping: String?,

    @get:Schema(
        description = "在庫ID",
        maxLength = 20
    )
    @field:Size(max= 20)
    val inventoriesId: String?,

    @get:Schema(
        description = "仕入先",
        required = true,
        maxLength = 20
    )
    @field:NotNull
    @field:NotBlank
    @field:Size(max= 20)
    val supplier: String,

    @get:Schema(
        description = "同期プランコード",
        maxLength = 80
    )
    @field:Size(max =80)
    val syncPlanCode: String?,

    @get:Schema(
        description = "部屋ID",
        maxLength = 80
    )
    @field:Size(max= 80)
    val roomId: String?,

    @get:Schema(
        description = "料金ID",
        maxLength = 80
    )
    @field:Size(max= 80)
    val rateId: String?,

    @get:Schema(
        description = "タイム21",
        maxLength = 20
    )
    @field:Size(max= 20)
    val tym21: String?,

    @get:Schema(
        description = "最終更新日時",
        required = true
    )
    @field:NotNull
    @field:NotBlank
    val updatedDatetime: LocalDateTime
)