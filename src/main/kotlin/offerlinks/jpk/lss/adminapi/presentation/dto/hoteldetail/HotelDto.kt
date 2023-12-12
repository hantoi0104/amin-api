package offerlinks.jpk.lss.adminapi.presentation.dto.hoteldetail

import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime
import java.util.UUID

@Schema(description = "ホテル")
data class HotelDto(
    @get:Schema(
        description = "ホテルID"
    )
    val hotelId: UUID?,

    @get:Schema(
        description = "ホテル名(英語)"
    )
    val hotelNameEn: String?,

    @get:Schema(
        description = "ホテル名"
    )
    val hotelName: String?,

    @get:Schema(
        description = "都市"
    )
    val cityCode: String?,

    @get:Schema(
        description = "ホテルコード"
    )
    val hotelCode: String?,

    @get:Schema(
        description = "連絡先"
    )
    val contact: String?,

    @get:Schema(
        description = "連絡先2"
    )
    val contact2: String?,

    @get:Schema(
        description = "グレード"
    )
    val grade: String?,

    @get:Schema(
        description = "送迎プラン"
    )
    val transferPlan: String?,

    @get:Schema(
        description = "送迎プラン2"
    )
    val transferPlan2: String?,

    @get:Schema(
        description = "送迎プラン3"
    )
    val transferPlan3: String?,

    @get:Schema(
        description = "送迎プラン4"
    )
    val transferPlan4: String?,

    @get:Schema(
        description = "送迎プラン5"
    )
    val transferPlan5: String?,

    @get:Schema(
        description = "送迎プラン6"
    )
    val transferPlan6: String?,

    @get:Schema(
        description = "コースコード"
    )
    val courseCode: String?,

    @get:Schema(
        description = "コースコード2"
    )
    val courseCode2: String?,

    @get:Schema(
        description = "コースコード3"
    )
    val courseCode3: String?,

    @get:Schema(
        description = "コースコード4"
    )
    val courseCode4: String?,

    @get:Schema(
        description = "表示"
    )
    val display: String?,

    @get:Schema(
        description = "表示順位"
    )
    val displayOrder: Int?,

    @get:Schema(
        description = "観光プラン不可"
    )
    val sightseeingPlanNotAvailable: Int?,

    @get:Schema(
        description = "同期ホテルコード（JTOS）"
    )
    val syncHotelCodeJtos: String?,

    @get:Schema(
        description = "同期ホテルコード（エアトリ）"
    )
    val syncHotelCodeAirTrip: String?,

    @get:Schema(
        description = "同期ホテルコード（DerbySoft）"
    )
    val syncHotelCodeDerbySoft: String?,

    @get:Schema(
        description = "精算方法（Derbysoft）"
    )
    val paymentDerbysoft: String?,

    @get:Schema(
        description = "電話番号"
    )
    val telephoneNumber: String?,

    @get:Schema(
        description = "FAX番号"
    )
    val faxNumber: String?,

    @get:Schema(
        description = "郵便番号"
    )
    val zipCode: String?,

    @get:Schema(
        description = "住所(英語)"
    )
    val addressEn: String?,

    @get:Schema(
        description = "住所"
    )
    val address: String?,

    @get:Schema(
        description = "チェックイン時間"
    )
    val checkInTime: String?,

    @get:Schema(
        description = "チェックアウト時間"
    )
    val checkOutTime: String?,

    @get:Schema(
        description = "朝食"
    )
    val breakfast: String?,

    @get:Schema(
        description = "ロケーション"
    )
    val location: String?,

    @get:Schema(
        description = "最寄りの駅・空港名"
    )
    val nearby: String?,

    @get:Schema(
        description = "アクセス情報"
    )
    val accessInformation: String?,

    @get:Schema(
        description = "周辺観光情報"
    )
    val surroundingTouristInformation: String?,

    @get:Schema(
        description = "説明・営業日等"
    )
    val contactDescription: String?,

    @get:Schema(
        description = "E-MAILアドレス"
    )
    val email: String?,

    @get:Schema(
        description = "URL"
    )
    val linkUrl: String?,

    @get:Schema(
        description = "緯度"
    )
    val latitude: String?,

    @get:Schema(
        description = "経度"
    )
    val longitude: String?,

    @get:Schema(
        description = "備考"
    )
    val remarks: String?,

    @get:Schema(
        description = "ホテル見出し"
    )
    val hotelCaption: String?,

    @get:Schema(
        description = "ホテル概要"
    )
    val hotelOverview: String?,

    @get:Schema(
        description = "改装内容"
    )
    val renovationDescription: String?,

    @get:Schema(
        description = "リゾートフィー金額"
    )
    val resortFeeAmount: Int?,

    @get:Schema(
        description = "通貨コード"
    )
    val currency: String?,

    @get:Schema(
        description = "年齢制限"
    )
    val ageRequirement: String?,

    @get:Schema(
        description = "デポジット案内"
    )
    val depositGuide: String?,

    @get:Schema(
        description = "予備(フリーフォーム)"
    )
    val reserve: String?,

    @get:Schema(
        description = "リゾートフィー他付加価値料金(フリーフォーム)"
    )
    val resortFeeAddAmount: Int?,

    @get:Schema(
        description = "ホテルチェーン"
    )
    val hotelChain: String?,

    @get:Schema(
        description = "自社仕入れホテルコード"
    )
    val localHotelCode: String?,

    @get:Schema(
        description = "リゾートフィーに含まれるもの"
    )
    val resortFeeTarget: String?,

    @get:Schema(
        description = "自社仕入れ仕入先"
    )
    val localSupplier: String?,

    @get:Schema(
        description = "サプライヤーコード（DerbySoft）"
    )
    val supplierCodeDerbySoft: String?,

    @get:Schema(
        description = "注意事項"
    )
    val notes: String?,

    @get:Schema(
        description = "最終更新日時"
    )
    val updatedDatetime: LocalDateTime?
)
