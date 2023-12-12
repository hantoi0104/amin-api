package offerlinks.jpk.lss.adminapi.presentation.dto.plandetail

import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime
import java.util.UUID

@Schema(description = "プラン")
 data class PlanDto (
    @get:Schema(
        description = "プランID"
    )
    val planId: UUID?,

    @get:Schema(
        description = "ホテルID"
    )
    val hotelId: UUID?,

    @get:Schema(
        description = "プラン名"
    )
    val planName: String?,

    @get:Schema(
        description = "プラン名（英字）"
    )
    val planNameEn: String?,

    @get:Schema(
        description = "プランコード"
    )
    val planCode: String?,

    @get:Schema(
        description = "表示"
    )
    val isActive: String?,

    @get:Schema(
        description = "販売開始日時",
        format = "yyyy-MM-dd HH:mm"
    )
    val startDate: LocalDateTime?,

    @get:Schema(
        description = "販売終了日時",
        format = "yyyy-MM-dd HH:mm"
    )
    val endDate: LocalDateTime?,

    @get:Schema(
        description = "販売対象"
    )
    val salesChannel: String?,

    @get:Schema(
        description = "食事"
    )
    val meal: String?,

    @get:Schema(
        description = "リゾートフィー"
    )
    val resortFee: String?,

    @get:Schema(
        description = "プラン説明"
    )
    val planDescription: String?,

    @get:Schema(
        description = "プラン優先順位・名寄せID"
    )
    val planAggregationId: String?,

    @get:Schema(
        description = "名寄せ内優先順位"
    )
    val planAggregationPriority: String?,

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
    val closeDay: String,

    @get:Schema(
        description = "通貨"
    )
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
        description = "添寝可能"
    )
    val coSleeping: String?,

    @get:Schema(
        description = "在庫ID"
    )
    val inventoriesId: String?,

    @get:Schema(
        description = "仕入先"
    )
    val supplier: String?,

    @get:Schema(
        description = "同期プランコード"
    )
    val syncPlanCode: String?,

    @get:Schema(
        description = "部屋ID"
    )
    val roomId: String?,

    @get:Schema(
        description = "料金ID"
    )
    val rateId: String?,

    @get:Schema(
        description = "タイム21"
    )
    val tym21: String?,

    @get:Schema(
        description = "最終更新日時"
    )
    val updatedDatetime: LocalDateTime?

 )