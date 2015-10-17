package com.kodekutters.core

import scala.collection.immutable.HashMap
import java.util.UUID

/**
  * Characteristics are defined attribute types that contain a single logical value.
  * Only adopted characteristics are listed
  *
  * ref: https://developer.bluetooth.org/gatt/characteristics/Pages/CharacteristicsHome.aspx
 */
object Characteristic {

  import GattUtils._

  val AEROBIC_HEART_RATE_LOWER_LIMIT = new UUID((0x2A7EL << 32) | 0x1000, leastSigBits)
  val AEROBIC_HEART_RATE_UPPER_LIMIT = new UUID((0x2A84L << 32) | 0x1000, leastSigBits)
  val AEROBIC_THRESHOLD = new UUID((0x2A7FL << 32) | 0x1000, leastSigBits)
  val AGE = new UUID((0x2A80L << 32) | 0x1000, leastSigBits)
  val AGGREGATE = new UUID((0x2A5AL << 32) | 0x1000, leastSigBits)
  val ALERT_CATEGORY_ID = new UUID((0x2A43L << 32) | 0x1000, leastSigBits)
  val ALERT_CATEGORY_ID_BIT_MASK = new UUID((0x2A42L << 32) | 0x1000, leastSigBits)
  val ALERT_LEVEL = new UUID((0x2A06L << 32) | 0x1000, leastSigBits)
  val ALERT_NOTIFICATION_CONTROL_POINT = new UUID((0x2A44L << 32) | 0x1000, leastSigBits)
  val ALERT_STATUS = new UUID((0x2A3FL << 32) | 0x1000, leastSigBits)
  val ALTITUDE = new UUID((0x2AB3L << 32) | 0x1000, leastSigBits)
  val ANAEROBIC_HEART_RATE_LOWER_LIMIT = new UUID((0x2A81L << 32) | 0x1000, leastSigBits)
  val ANAEROBIC_HEART_RATE_UPPER_LIMIT = new UUID((0x2A82L << 32) | 0x1000, leastSigBits)
  val ANAEROBIC_THRESHOLD = new UUID((0x2A83L << 32) | 0x1000, leastSigBits)
  val ANALOG = new UUID((0x2A58L << 32) | 0x1000, leastSigBits)
  val APPARENT_WIND_DIRECTION = new UUID((0x2A73L << 32) | 0x1000, leastSigBits)
  val APPARENT_WIND_SPEED = new UUID((0x2A72L << 32) | 0x1000, leastSigBits)
  val APPEARANCE = new UUID((0x2A01L << 32) | 0x1000, leastSigBits)

  val BAROMETRIC_PRESSURE_TREND = new UUID((0x2AA3L << 32) | 0x1000, leastSigBits)
  val BATTERY_LEVEL = new UUID((0x2A19L << 32) | 0x1000, leastSigBits)
  val BLOOD_PRESSURE_FEATURE = new UUID((0x2A49L << 32) | 0x1000, leastSigBits)
  val BLOOD_PRESSURE_MEASUREMENT = new UUID((0x2A35L << 32) | 0x1000, leastSigBits)
  val BODY_COMPOSITION_FEATURE = new UUID((0x2A9BL << 32) | 0x1000, leastSigBits)
  val BODY_COMPOSITION_MEASUREMENT = new UUID((0x2A9CL << 32) | 0x1000, leastSigBits)
  val BODY_SENSOR_LOCATION = new UUID((0x2A38L << 32) | 0x1000, leastSigBits)
  val BOND_MANAGEMENT_CONTROL_POINT = new UUID((0x2AA4L << 32) | 0x1000, leastSigBits)
  val BOND_MANAGEMENT_CONTROL_FEATURE = new UUID((0x2AA5L << 32) | 0x1000, leastSigBits)
  val BOOT_KEYOBARD_INPUT_REPORT = new UUID((0x2A22L << 32) | 0x1000, leastSigBits)
  val BOOT_KEYOBARD_OUTPUT_REPORT = new UUID((0x2A32L << 32) | 0x1000, leastSigBits)
  val BOOT_MOUSE_INPUT_REPORT = new UUID((0x2A33L << 32) | 0x1000, leastSigBits)

  val CENTRAL_ADDRESS_RESOLUTION = new UUID((0x2AA6L << 32) | 0x1000, leastSigBits)
  val CGM_FEATURE = new UUID((0x2AA8L << 32) | 0x1000, leastSigBits)
  val CGM_MEASUREMENT = new UUID((0x2AA7L << 32) | 0x1000, leastSigBits)
  val CGM_SESSION_RUN_TIME = new UUID((0x2AABL << 32) | 0x1000, leastSigBits)
  val CGM_SESSION_START_TIME = new UUID((0x2AAAL << 32) | 0x1000, leastSigBits)
  val CGM_SPECIFIC_OPS_CONTROL_POINT = new UUID((0x2AACL << 32) | 0x1000, leastSigBits)
  val CGM_STATUS = new UUID((0x2AA9L << 32) | 0x1000, leastSigBits)
  val CSC_FEATURE = new UUID((0x2A5CL << 32) | 0x1000, leastSigBits)
  val CSC_MEASUREMENT = new UUID((0x2A5BL << 32) | 0x1000, leastSigBits)
  val CURRENT_TIME = new UUID((0x2A2BL << 32) | 0x1000, leastSigBits)
  val CYCLING_POWER_CONTROL_POINT = new UUID((0x2A66L << 32) | 0x1000, leastSigBits)
  val CYCLING_POWER_FEATURE = new UUID((0x2A65L << 32) | 0x1000, leastSigBits)
  val CYCLING_POWER_MEASUREMENT = new UUID((0x2A63L << 32) | 0x1000, leastSigBits)
  val CYCLING_POWER_VECTOR = new UUID((0x2A64L << 32) | 0x1000, leastSigBits)

  val DATABASE_CHANGE_INCREMENT = new UUID((0x2A99L << 32) | 0x1000, leastSigBits)
  val DATE_OF_BIRTH = new UUID((0x2A85L << 32) | 0x1000, leastSigBits)
  val DATE_OF_THRESHOLD_ASSESSMENT = new UUID((0x2A86L << 32) | 0x1000, leastSigBits)
  val DATE_TIME = new UUID((0x2A08L << 32) | 0x1000, leastSigBits)
  val DAY_DATE_TIME = new UUID((0x2A0AL << 32) | 0x1000, leastSigBits)
  val DAY_OF_WEEK = new UUID((0x2A09L << 32) | 0x1000, leastSigBits)
  val DESCRIPTOR_VALUE_CHANGED = new UUID((0x2A7DL << 32) | 0x1000, leastSigBits)
  val DEVICE_NAME = new UUID((0x2A00L << 32) | 0x1000, leastSigBits)
  val DEW_POINT = new UUID((0x2A7BL << 32) | 0x1000, leastSigBits)
  val DIGITAL = new UUID((0x2A56L << 32) | 0x1000, leastSigBits)
  val DST_OFFSET = new UUID((0x2A0DL << 32) | 0x1000, leastSigBits)

  val ELEVATION = new UUID((0x2A6CL << 32) | 0x1000, leastSigBits)
  val EMAIL_ADDRESS = new UUID((0x2A87L << 32) | 0x1000, leastSigBits)
  val EXACT_TIME_256 = new UUID((0x2A0CL << 32) | 0x1000, leastSigBits)

  val FIRMWARE_REVISION_STRING = new UUID((0x2A26L << 32) | 0x1000, leastSigBits)
  val FIRST_NAME = new UUID((0x2A8AL << 32) | 0x1000, leastSigBits)
  val FIVE_ZONE_HEART_RATE_LIMITS = new UUID((0x2A8BL << 32) | 0x1000, leastSigBits)
  val FLOOR_NUMBER = new UUID((0x2AB2L << 32) | 0x1000, leastSigBits)

  val GENDER = new UUID((0x2A8CL << 32) | 0x1000, leastSigBits)
  val GLUCOSE_FEATURE = new UUID((0x2A51L << 32) | 0x1000, leastSigBits)
  val GLUCOSE_MEASUREMENT = new UUID((0x2A18L << 32) | 0x1000, leastSigBits)
  val GLUCOSE_MEASUREMENT_CONTROL = new UUID((0x2A34L << 32) | 0x1000, leastSigBits)
  val GUST_FACTOR = new UUID((0x2A74L << 32) | 0x1000, leastSigBits)

  val HARDWARE_REVISION_STRING = new UUID((0x2A2L << 32) | 0x1000, leastSigBits)
  val HEART_RATE_CONTROL_POINT = new UUID((0x2A39L << 32) | 0x1000, leastSigBits)
  val HEART_RATE_MAX = new UUID((0x2A8DL << 32) | 0x1000, leastSigBits)
  val HEART_RATE_MEASUREMENT = new UUID((0x2A3L << 32) | 0x1000, leastSigBits)
  val HEAT_INDEX = new UUID((0x2A7AL << 32) | 0x1000, leastSigBits)
  val HEIGHT = new UUID((0x2A8EL << 32) | 0x1000, leastSigBits)
  val HID_CONTROL_POINT = new UUID((0x2A4CL << 32) | 0x1000, leastSigBits)
  val HID_INFORMATION = new UUID((0x2A4AL << 32) | 0x1000, leastSigBits)
  val HIP_CIRCUMFERENCE = new UUID((0x2A8FL << 32) | 0x1000, leastSigBits)
  val HUMIDITY = new UUID((0x2A6FL << 32) | 0x1000, leastSigBits)

  val IEEE11073_20601_REGULATORY_CERTIFICATION_DATA_LIST = new UUID((0x2A2AL << 32) | 0x1000, leastSigBits)
  val INDOOR_POSITIONING_CONFIGURATION = new UUID((0x2AADL << 32) | 0x1000, leastSigBits)
  val INTERMEDIATE_CUFF_PRESSURE = new UUID((0x2A3L << 32) | 0x1000, leastSigBits)
  val INTERMEDIATE_TEMPERATURE = new UUID((0x2A1EL << 32) | 0x1000, leastSigBits)
  val IRRADIANCE = new UUID((0x2A77L << 32) | 0x1000, leastSigBits)

  val LANGUAGE = new UUID((0x2AA2L << 32) | 0x1000, leastSigBits)
  val LAST_NAME = new UUID((0x2A90L << 32) | 0x1000, leastSigBits)
  val LATITUDE = new UUID((0x2AAEL << 32) | 0x1000, leastSigBits)
  val LN_CONTROL_POINT = new UUID((0x2A6BL << 32) | 0x1000, leastSigBits)
  val LN_FEATURE = new UUID((0x2A6AL << 32) | 0x1000, leastSigBits)
  val LOCAL_EAST_COORDINATE = new UUID((0x2AB1L << 32) | 0x1000, leastSigBits)
  val LOCAL_NORTH_COORDINATE = new UUID((0x2AB0L << 32) | 0x1000, leastSigBits)
  val LOCAL_TIME_INFORMATION = new UUID((0x2A0FL << 32) | 0x1000, leastSigBits)
  val LOCATION_AND_SPEED = new UUID((0x2A67L << 32) | 0x1000, leastSigBits)
  val LOCATION_NAME = new UUID((0x2AB5L << 32) | 0x1000, leastSigBits)
  val LONGITUDE = new UUID((0x2AAFL << 32) | 0x1000, leastSigBits)

  val MAGNETIC_DECLINATION = new UUID((0x2A2CL << 32) | 0x1000, leastSigBits)
  val MAGNETIC_FLUX_DENSITY_2D = new UUID((0x2AA0L << 32) | 0x1000, leastSigBits)
  val MAGNETIC_FLUX_DENSITY_3D = new UUID((0x2AA1L << 32) | 0x1000, leastSigBits)
  val MAXIMUM_RECOMMENDED_HEART_RATE = new UUID((0x2A91L << 32) | 0x1000, leastSigBits)
  val MANUFACTURER_NAME_STRING = new UUID((0x2A29L << 32) | 0x1000, leastSigBits)
  val MEASUREMENT_INTERVAL = new UUID((0x2A21L << 32) | 0x1000, leastSigBits)
  val MODEL_NUMBER_STRING = new UUID((0x2A24L << 32) | 0x1000, leastSigBits)

  val NAVIGATION = new UUID((0x2A68L << 32) | 0x1000, leastSigBits)
  val NEW_ALERT = new UUID((0x2A46L << 32) | 0x1000, leastSigBits)

  val PERIPERAL_PREFFERED_CONNECTION_PARAMETERS = new UUID((0x2A04L << 32) | 0x1000, leastSigBits)
  val PERIPHERAL_PRIVACY_FLAG = new UUID((0x2A02L << 32) | 0x1000, leastSigBits)
  val PLX_CONTINUOUS_MEASUREMENT = new UUID((0x2A5FL << 32) | 0x1000, leastSigBits)
  val PLX_FEATURES = new UUID((0x2A60L << 32) | 0x1000, leastSigBits)
  val PLX_SPOT_CHECK_MEASUREMENT = new UUID((0x2A5EL << 32) | 0x1000, leastSigBits)
  val PNP_PID = new UUID((0x2A50L << 32) | 0x1000, leastSigBits)
  val POLLEN_CONCENTRATION = new UUID((0x2A75L << 32) | 0x1000, leastSigBits)
  val POSITION_QUALITY = new UUID((0x2A69L << 32) | 0x1000, leastSigBits)
  val PRESSURE = new UUID((0x2A6DL << 32) | 0x1000, leastSigBits)
  val PROTOCOL_MODE = new UUID((0x2A4EL << 32) | 0x1000, leastSigBits)

  val RECONNECTION_ADDRESS = new UUID((0x2A03L << 32) | 0x1000, leastSigBits)
  val RECORD_ACCESS_CONTROL_POINT = new UUID((0x2A52L << 32) | 0x1000, leastSigBits)
  val REFERENCE_TIME_INFORMATION = new UUID((0x2A14L << 32) | 0x1000, leastSigBits)
  val REPORT = new UUID((0x2A4DL << 32) | 0x1000, leastSigBits)
  val REPORT_MAP = new UUID((0x2A4BL << 32) | 0x1000, leastSigBits)
  val RESTING_HEART_RATE = new UUID((0x2A92L << 32) | 0x1000, leastSigBits)
  val RINGER_CONTROL_POINT = new UUID((0x2A40L << 32) | 0x1000, leastSigBits)
  val RINGER_SETTING = new UUID((0x2A41L << 32) | 0x1000, leastSigBits)
  val RSC_FEATURE = new UUID((0x2A54L << 32) | 0x1000, leastSigBits)
  val RSC_MEASUREMENT = new UUID((0x2A53L << 32) | 0x1000, leastSigBits)

  val SC_CONTROL_POINT = new UUID((0x2A55L << 32) | 0x1000, leastSigBits)
  val SCAN_INTERVAL_WINDOW = new UUID((0x2A4FL << 32) | 0x1000, leastSigBits)
  val SCAN_REFRESH = new UUID((0x2A31L << 32) | 0x1000, leastSigBits)
  val SENSOR_LOCATION = new UUID((0x2A5DL << 32) | 0x1000, leastSigBits)
  val SERIAL_NUMBER_STRING = new UUID((0x2A25L << 32) | 0x1000, leastSigBits)
  val SERVICE_CHANGED = new UUID((0x2A05L << 32) | 0x1000, leastSigBits)
  val SOFTWARE_REVISION_STRING = new UUID((0x2A28L << 32) | 0x1000, leastSigBits)
  val SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS = new UUID((0x2A93L << 32) | 0x1000, leastSigBits)
  val SUPPORTED_NEW_ALERT_CATEGORY = new UUID((0x2A47L << 32) | 0x1000, leastSigBits)
  val SUPPORTED_UNREAD_ALERT_CATEGORY = new UUID((0x2A48L << 32) | 0x1000, leastSigBits)
  val SYSTEM_ID = new UUID((0x2A23L << 32) | 0x1000, leastSigBits)

  val TEMPERATURE = new UUID((0x2A6EL << 32) | 0x1000, leastSigBits)
  val TEMPERATURE_MEASUREMENT = new UUID((0x2A1CL << 32) | 0x1000, leastSigBits)
  val TEMPERATURE_TYPE = new UUID((0x2A1DL << 32) | 0x1000, leastSigBits)
  val THREE_ZONE_HEART_RATE_LIMITS = new UUID((0x2A94L << 32) | 0x1000, leastSigBits)
  val TIME_ACCURACY = new UUID((0x2A12L << 32) | 0x1000, leastSigBits)
  val TIME_SOURCE = new UUID((0x2A13L << 32) | 0x1000, leastSigBits)
  val TIME_UPDATE_CONTROL_POINT = new UUID((0x2A16L << 32) | 0x1000, leastSigBits)
  val TIME_UPDATE_STATE = new UUID((0x2A17L << 32) | 0x1000, leastSigBits)
  val TIME_WITH_DST = new UUID((0x2A11L << 32) | 0x1000, leastSigBits)
  val TIME_ZONE = new UUID((0x2A0EL << 32) | 0x1000, leastSigBits)
  val TRUE_WIND_DIRECTION = new UUID((0x2A71L << 32) | 0x1000, leastSigBits)
  val TRUE_WIND_SPEED = new UUID((0x2A70L << 32) | 0x1000, leastSigBits)
  val TWO_ZONE_HEART_RATE_LIMIT = new UUID((0x2A95L << 32) | 0x1000, leastSigBits)
  val TX_POWER_LEVEL = new UUID((0x2A07L << 32) | 0x1000, leastSigBits)

  val UNCERTAINTY = new UUID((0x2AB4L << 32) | 0x1000, leastSigBits)
  val UNREAD_ALERT_STATUS = new UUID((0x2A45L << 32) | 0x1000, leastSigBits)
  val USER_CONTROL_POINT = new UUID((0x2A9FL << 32) | 0x1000, leastSigBits)
  val USER_INDEX = new UUID((0x2A9AL << 32) | 0x1000, leastSigBits)
  val UV_INDEX = new UUID((0x2A76L << 32) | 0x1000, leastSigBits)

  val VO2_MAX = new UUID((0x2A96L << 32) | 0x1000, leastSigBits)
  val WAIST_CIRCUMFERENCE = new UUID((0x2A97L << 32) | 0x1000, leastSigBits)
  val WEIGHT = new UUID((0x2A98L << 32) | 0x1000, leastSigBits)
  val WEIGHT_MEASUREMENT = new UUID((0x2A9DL << 32) | 0x1000, leastSigBits)
  val WEIGHT_SCALE_FEATURE = new UUID((0x2A9EL << 32) | 0x1000, leastSigBits)
  val WIND_CHILL = new UUID((0x2A79L << 32) | 0x1000, leastSigBits)

  // ------------------------------------------------------------
  // ------------------------------------------------------------
  // ------------------------------------------------------------

  val AGGREGATE_INPUT = new UUID((0x2A5AL << 32) | 0x1000, leastSigBits)
  val ANALOG_INPUT = new UUID((0x2A58L << 32) | 0x1000, leastSigBits)
  val ANALOG_OUTPUT = new UUID((0x2A59L << 32) | 0x1000, leastSigBits)
  val DIGITAL_INPUT = new UUID((0x2A56L << 32) | 0x1000, leastSigBits)
  val DIGITAL_OUTPUT = new UUID((0x2A57L << 32) | 0x1000, leastSigBits)
  val EXACT_TIME_100 = new UUID((0x2A0BL << 32) | 0x1000, leastSigBits)
  val NETWORK_AVAILABILITY = new UUID((0x2A3EL << 32) | 0x1000, leastSigBits)
  val SCIENTIFIC_TEMPERATURE_IN_CELSIUS = new UUID((0x2A3CL << 32) | 0x1000, leastSigBits)
  val SECONDARY_TIME_ZONE = new UUID((0x2A10L << 32) | 0x1000, leastSigBits)
  val STRING = new UUID((0x2A3DL << 32) | 0x1000, leastSigBits)
  val TEMPERATURE_IN_CELSIUS = new UUID((0x2A1FL << 32) | 0x1000, leastSigBits)
  val TEMPERATURE_IN_FAHRENHEIT = new UUID((0x2A20L << 32) | 0x1000, leastSigBits)
  val TIME_BROADCAST = new UUID((0x2A15L << 32) | 0x1000, leastSigBits)
  val BATTERY_LEVEL_STATE = new UUID((0x2A1BL << 32) | 0x1000, leastSigBits)
  val BATTERY_POWER_STATE = new UUID((0x2A1AL << 32) | 0x1000, leastSigBits)
  val PULSE_OXIMETRY_CONTINUOUS_MEASUREMENT = new UUID((0x2A5FL << 32) | 0x1000, leastSigBits)
  val PULSE_OXIMETRY_CONTROL_POINT = new UUID((0x2A62L << 32) | 0x1000, leastSigBits)
  val PULSE_OXIMETRY_FEATURES = new UUID((0x2A61L << 32) | 0x1000, leastSigBits)
  val PULSE_OXIMETRY_PULSATILE_EVENT = new UUID((0x2A60L << 32) | 0x1000, leastSigBits)
  val PULSE_OXIMETRY_SPOT_CHECK_MEASUREMENT = new UUID((0x2A5EL << 32) | 0x1000, leastSigBits)
  val RECORD_ACCESS_CONTROL_POINT_TESTVERSION = new UUID((0x2A52L << 32) | 0x1000, leastSigBits)
  val REMOVABLE = new UUID((0x2A3AL << 32) | 0x1000, leastSigBits)
  val SERVICE_REQUIRED = new UUID((0x2A3BL << 32) | 0x1000, leastSigBits)

  val attributes = HashMap[UUID, String](
    ALERT_CATEGORY_ID -> "Alert Category ID",
    ALERT_CATEGORY_ID_BIT_MASK -> "Alert Category ID Bit Mask",
    ALERT_LEVEL -> "Alert Level",
    ALERT_NOTIFICATION_CONTROL_POINT -> "Alert Notification Control Point",
    ALERT_STATUS -> "Alert Status",
    APPEARANCE -> "Appearance",
    AEROBIC_HEART_RATE_LOWER_LIMIT -> "Aerobic Heart Rate Lower Limit",
    AEROBIC_HEART_RATE_UPPER_LIMIT -> "Aerobic Heart Rate Upper Limit",
    AEROBIC_THRESHOLD -> "Aerobic Threshold",
    AGE -> "Age",
    AGGREGATE -> "Aggregate",
    ALTITUDE -> "Altitude",
    ANALOG -> "Analog",
    APPARENT_WIND_DIRECTION -> "Apparent Wind Direction",
    APPARENT_WIND_SPEED -> "Apparent Wind Speed",

    BATTERY_LEVEL -> "Battery Level",
    BLOOD_PRESSURE_FEATURE -> "Blood Pressure Feature",
    BLOOD_PRESSURE_MEASUREMENT -> "Blood Pressure Measurement",
    BODY_SENSOR_LOCATION -> "Body Sensor Location",
    BOOT_KEYOBARD_INPUT_REPORT -> "Boot Keyboard Input Report",
    BOOT_KEYOBARD_OUTPUT_REPORT -> "Boot Keyboard Output Report",
    BOOT_MOUSE_INPUT_REPORT -> "Boot Mouse Input Report",
    BAROMETRIC_PRESSURE_TREND -> "Barometric Pressure_trend",
    BODY_COMPOSITION_FEATURE -> "Body Composition Feature",
    BODY_COMPOSITION_MEASUREMENT -> "Body Composition Measurement",
    BOND_MANAGEMENT_CONTROL_POINT -> "Bond Management Control Point",
    BOND_MANAGEMENT_CONTROL_FEATURE -> "Bond Management Control Feature",

    CSC_FEATURE -> "CSC Feature",
    CSC_MEASUREMENT -> "CSC Measurement",
    CURRENT_TIME -> "Current Time",
    CYCLING_POWER_CONTROL_POINT -> "Cycling Power Control Point",
    CYCLING_POWER_FEATURE -> "Cycling Power Feature",
    CYCLING_POWER_MEASUREMENT -> "Cycling Power Measurement",
    CYCLING_POWER_VECTOR -> "Cycling Power Vector",
    CENTRAL_ADDRESS_RESOLUTION -> "Central Address Resolution",
    CGM_SESSION_RUN_TIME -> "Cgm Session Run Time",
    CGM_SESSION_START_TIME -> "Cgm Session Start Time",
    CGM_SPECIFIC_OPS_CONTROL_POINT -> "Cgm Specific Ops Control Point",
    CGM_STATUS -> "Cgm Status",

    DATE_TIME -> "Date Time",
    DAY_DATE_TIME -> "Day Date Time",
    DAY_OF_WEEK -> "Day of Week",
    DEVICE_NAME -> "Device Name",
    DST_OFFSET -> "DST Offset",
    DATABASE_CHANGE_INCREMENT -> "Database Change Increment",
    DATE_OF_BIRTH -> "Date Of Birth",
    DATE_OF_THRESHOLD_ASSESSMENT -> "Date Of Threshold Assessment",
    DESCRIPTOR_VALUE_CHANGED -> "Descriptor Value Changed",
    DEW_POINT -> "Dew Point",
    DIGITAL -> "Digital",

    EXACT_TIME_256 -> "Exact Time 256",
    ELEVATION -> "Elevation",
    EMAIL_ADDRESS -> "Email Address",

    FIRMWARE_REVISION_STRING -> "Firmware Revision String",
    FIRST_NAME -> "First Name",
    FIVE_ZONE_HEART_RATE_LIMITS -> "Five Zone Heart Rate Limits",
    FLOOR_NUMBER -> "Floor Number",

    GLUCOSE_FEATURE -> "Glucose Feature",
    GLUCOSE_MEASUREMENT -> "Glucose Measurement",
    GLUCOSE_MEASUREMENT_CONTROL -> "Glucose Measurement Context",
    GENDER -> "Gender",
    GUST_FACTOR -> "Gust Factor",

    HARDWARE_REVISION_STRING -> "Hardware Revision String",
    HEART_RATE_CONTROL_POINT -> "Heart Rate Control Point",
    HEART_RATE_MEASUREMENT -> "Heart Rate Measurement",
    HID_CONTROL_POINT -> "HID Control Point",
    HID_INFORMATION -> "HID Information",
    HEART_RATE_MAX -> "Heart Rate Max",
    HEAT_INDEX -> "Heat Index",
    HEIGHT -> "Height",
    HIP_CIRCUMFERENCE -> "Hip Circumference",
    HUMIDITY -> "Humidity",

    IEEE11073_20601_REGULATORY_CERTIFICATION_DATA_LIST -> "IEEE 11073-20601 Regulatory Certification Data List",
    INTERMEDIATE_CUFF_PRESSURE -> "Intermediate Cuff Pressure",
    INTERMEDIATE_TEMPERATURE -> "Intermediate Temperature",
    INDOOR_POSITIONING_CONFIGURATION -> "Indoor Positioning Configuration",
    IRRADIANCE -> "Irradiance",

    LN_CONTROL_POINT -> "LN Control Point",
    LN_FEATURE -> "LN Feature",
    LOCAL_TIME_INFORMATION -> "Local Time Information",
    LOCATION_AND_SPEED -> "Location and Speed",
    LANGUAGE -> "Language",
    LAST_NAME -> "Last Name",
    LATITUDE -> "Latitude",
    LOCAL_EAST_COORDINATE -> "Local East Coordinate",
    LOCAL_NORTH_COORDINATE -> "Local North Coordinate",
    LOCATION_NAME -> "Location Name",
    LONGITUDE -> "Longitude",

    MANUFACTURER_NAME_STRING -> "Manufacturer Name String",
    MEASUREMENT_INTERVAL -> "Measurement Interval",
    MODEL_NUMBER_STRING -> "Model Number String",
    MAGNETIC_DECLINATION -> "Magnetic Declination",
    MAGNETIC_FLUX_DENSITY_2D -> "Magnetic Flux Density 2d",
    MAGNETIC_FLUX_DENSITY_3D -> "Magnetic Flux Density 3d",
    MAXIMUM_RECOMMENDED_HEART_RATE -> "Maximum Recommended Heart Rate",

    NAVIGATION -> "Navigation",
    NEW_ALERT -> "New Alert",

    PERIPERAL_PREFFERED_CONNECTION_PARAMETERS -> "Peripheral Preferred Connection Parameters",
    PERIPHERAL_PRIVACY_FLAG -> "Peripheral Privacy Flag",
    PNP_PID -> "PnP ID",
    POSITION_QUALITY -> "Position Quality",
    PROTOCOL_MODE -> "Protocol Mode",
    PLX_CONTINUOUS_MEASUREMENT -> "Plx Continuous Measurement",
    PLX_FEATURES -> "Plx Features",
    PLX_SPOT_CHECK_MEASUREMENT -> "Plx Spot Check Measurement",
    PNP_PID -> "Pnp Pid",
    POLLEN_CONCENTRATION -> "Pollen Concentration",
    PRESSURE -> "Pressure",

    RECONNECTION_ADDRESS -> "Reconnection Address",
    RECORD_ACCESS_CONTROL_POINT -> "Record Access Control Point",
    REFERENCE_TIME_INFORMATION -> "Reference Time Information",
    REPORT -> "Report",
    REPORT_MAP -> "Report Map",
    RINGER_CONTROL_POINT -> "Ringer Control Point",
    RINGER_SETTING -> "Ringer Setting",
    RSC_FEATURE -> "RSC Feature",
    RSC_MEASUREMENT -> "RSC Measurement",
    RESTING_HEART_RATE -> "Resting Heart Rate",
    RINGER_CONTROL_POINT -> "Ringer Control Point",

    SC_CONTROL_POINT -> "SC Control Point",
    SCAN_INTERVAL_WINDOW -> "Scan Interval Window",
    SCAN_REFRESH -> "Scan Refresh",
    SENSOR_LOCATION -> "Sensor Location",
    SERIAL_NUMBER_STRING -> "Serial Number String",
    SERVICE_CHANGED -> "Service Changed",
    SOFTWARE_REVISION_STRING -> "Software Revision String",
    SUPPORTED_NEW_ALERT_CATEGORY -> "Supported New Alert Category",
    SUPPORTED_UNREAD_ALERT_CATEGORY -> "Supported Unread Alert Category",
    SYSTEM_ID -> "System ID",
    SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS -> "Sport Type For Aerobic And Anaerobic Thresholds",

    TEMPERATURE_MEASUREMENT -> "Temperature Measurement",
    TEMPERATURE_TYPE -> "Temperature Type",
    TIME_ACCURACY -> "Time Accuracy",
    TIME_SOURCE -> "Time Source",
    TIME_UPDATE_CONTROL_POINT -> "Time Update Control Point",
    TIME_UPDATE_STATE -> "Time Update State",
    TIME_WITH_DST -> "Time with DST",
    TIME_ZONE -> "Time Zone",
    TX_POWER_LEVEL -> "Tx Power Level",
    TEMPERATURE -> "Temperature",
    THREE_ZONE_HEART_RATE_LIMITS -> "Three Zone Heart Rate Limits",
    TRUE_WIND_DIRECTION -> "True Wind Direction",
    TRUE_WIND_SPEED -> "True Wind Speed",
    TWO_ZONE_HEART_RATE_LIMIT -> "Two Zone Heart Rate Limit",

    UNREAD_ALERT_STATUS -> "Unread Alert Status",

    UNCERTAINTY -> "Uncertainty",
    USER_CONTROL_POINT -> "User Control Point",
    USER_INDEX -> "User Index",
    UV_INDEX -> "UV Index",

    VO2_MAX -> "VO2 Max",
    WAIST_CIRCUMFERENCE -> "Waist Circumference",
    WEIGHT -> "Weight",
    WEIGHT_MEASUREMENT -> "Weight Measurement",
    WEIGHT_SCALE_FEATURE -> "Weight Scale Feature",
    WIND_CHILL -> "Wind Chill",

    // ------------------------------------------------------------
    // ------------------------------------------------------------
    // ------------------------------------------------------------

    AGGREGATE_INPUT -> "Aggregate Input",
    ANALOG_INPUT -> "Analog Input",
    ANALOG_OUTPUT -> "Analog Output",
    DIGITAL_INPUT -> "Digital Input",
    DIGITAL_OUTPUT -> "Digital Output",
    EXACT_TIME_100 -> "Exact Time 100",
    NETWORK_AVAILABILITY -> "Network Availability",
    SCIENTIFIC_TEMPERATURE_IN_CELSIUS -> "Scientific Temperature in Celsius",
    SECONDARY_TIME_ZONE -> "Secondary Time Zone",
    STRING -> "String",
    TEMPERATURE_IN_CELSIUS -> "Temperature in Celsius",
    TEMPERATURE_IN_FAHRENHEIT -> "Temperature in Fahrenheit",
    TIME_BROADCAST -> "Time Broadcast",
    BATTERY_LEVEL_STATE -> "Battery Level State",
    BATTERY_POWER_STATE -> "Battery Power State",
    PULSE_OXIMETRY_CONTINUOUS_MEASUREMENT -> "Pulse Oximetry Continuous Measurement",
    PULSE_OXIMETRY_CONTROL_POINT -> "Pulse Oximetry Control Point",
    PULSE_OXIMETRY_FEATURES -> "Pulse Oximetry Features",
    PULSE_OXIMETRY_PULSATILE_EVENT -> "Pulse Oximetry Pulsatile Event",
    PULSE_OXIMETRY_SPOT_CHECK_MEASUREMENT -> "Pulse Oximetry Spot Check Measurement",
    RECORD_ACCESS_CONTROL_POINT_TESTVERSION -> "Record Access Control point (Test Version)",
    REMOVABLE -> "Removable",
    SERVICE_REQUIRED -> "Service Required")

  def lookup(uuid: UUID, defaultName: String) = {
    attributes.get(uuid) match {
      case Some(name) => name
      case None => defaultName
    }
  }

  def find(uuid: UUID): Option[String] = attributes.get(uuid)

}