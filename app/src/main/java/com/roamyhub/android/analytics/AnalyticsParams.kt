package com.roamyhub.android.analytics

/**
 * Analytics parameter names
 * Keep consistent with iOS app for cross-platform tracking
 */
object AnalyticsParams {
    // Plan parameters
    const val PLAN_ID = "plan_id"
    const val PLAN_NAME = "plan_name"
    const val COUNTRY_CODE = "country_code"
    const val COUNTRY_NAME = "country_name"
    const val REGION = "region"
    const val REGION_NAME = "region_name"
    const val DURATION = "duration"
    const val DATA_AMOUNT = "data_amount"
    const val COVERAGE = "coverage"

    // Purchase parameters
    const val AMOUNT = "amount"
    const val CURRENCY = "currency"
    const val POINTS_USED = "points_used"
    const val POINTS_EARNED = "points_earned"
    const val PAYMENT_METHOD = "payment_method"
    const val ORDER_ID = "order_id"
    const val TRANSACTION_ID = "transaction_id"

    // Search parameters
    const val SEARCH_QUERY = "search_query"
    const val SEARCH_RESULTS_COUNT = "search_results_count"
    const val FILTER_TYPE = "filter_type"
    const val FILTER_VALUE = "filter_value"

    // eSIM parameters
    const val ESIM_ID = "esim_id"
    const val ESIM_STATUS = "esim_status"
    const val ICCID = "iccid"

    // Support parameters
    const val TICKET_ID = "ticket_id"
    const val TICKET_CATEGORY = "ticket_category"
    const val TICKET_STATUS = "ticket_status"

    // General parameters
    const val METHOD = "method"
    const val STATUS = "status"
    const val ERROR_MESSAGE = "error_message"
    const val ERROR_CODE = "error_code"
    const val SCREEN_NAME = "screen_name"
    const val SOURCE = "source"
}
