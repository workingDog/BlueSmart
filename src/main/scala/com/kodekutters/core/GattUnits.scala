package com.kodekutters.core

import java.util.UUID

import com.kodekutters.protocol.GattUnit

import scala.collection.immutable.HashMap


/**
  * Units are established international standards for the measurement of physical quantities
  *
  * ref: https://developer.bluetooth.org/gatt/units/Pages/default.aspx
  */
object GattUnits {

  import GattUtils._

  val UNITLESS = new UUID((0x2700L << 32) | 0x1000, leastSigBits)
  val LENGTH_METRE = new UUID((0x2701L << 32) | 0x1000, leastSigBits)
  val MASS_KILOGRAM = new UUID((0x2702L << 32) | 0x1000, leastSigBits)
  val TIME_SECOND = new UUID((0x2703L << 32) | 0x1000, leastSigBits)
  val ELECTRIC_CURRENT_AMPERE = new UUID((0x2704L << 32) | 0x1000, leastSigBits)
  val THERMODYNAMIC_TEMPERATURE_KELVIN = new UUID((0x2705L << 32) | 0x1000, leastSigBits)
  val AMOUNT_OF_SUBSTANCE_MOLE = new UUID((0x2706L << 32) | 0x1000, leastSigBits)
  val LUMINOUS_INTENSITY_CANDELA = new UUID((0x2707L << 32) | 0x1000, leastSigBits)
  val AREA_SQUARE_METRES = new UUID((0x2710L << 32) | 0x1000, leastSigBits)
  val VOLUME_CUBIC_METRES = new UUID((0x2711L << 32) | 0x1000, leastSigBits)
  val VELOCITY_METRES_PER_SECOND = new UUID((0x2712L << 32) | 0x1000, leastSigBits)
  val ACCELERATION_METRES_PER_SECOND_SQUARED = new UUID((0x2713L << 32) | 0x1000, leastSigBits)
  val WAVENUMBER_RECIPROCAL_METRE = new UUID((0x2714L << 32) | 0x1000, leastSigBits)
  val DENSITY_KILOGRAM_PER_CUBIC_METRE = new UUID((0x2715L << 32) | 0x1000, leastSigBits)
  val SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE = new UUID((0x2716L << 32) | 0x1000, leastSigBits)
  val SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM = new UUID((0x2717L << 32) | 0x1000, leastSigBits)
  val CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE = new UUID((0x2718L << 32) | 0x1000, leastSigBits)
  val MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE = new UUID((0x2719L << 32) | 0x1000, leastSigBits)
  val AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE = new UUID((0x271AL << 32) | 0x1000, leastSigBits)
  val MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE = new UUID((0x271BL << 32) | 0x1000, leastSigBits)
  val LUMINANCE_CANDELA_PER_SQUARE_METRE = new UUID((0x271CL << 32) | 0x1000, leastSigBits)
  val REFRACTIVE_INDEX = new UUID((0x271DL << 32) | 0x1000, leastSigBits)
  val RELATIVE_PERMEABILITY = new UUID((0x271EL << 32) | 0x1000, leastSigBits)
  val PLANE_ANGLE_RADIAN = new UUID((0x2720L << 32) | 0x1000, leastSigBits)
  val SOLID_ANGLE_STERADIAN = new UUID((0x2721L << 32) | 0x1000, leastSigBits)
  val FREQUENCY_HERTZ = new UUID((0x2722L << 32) | 0x1000, leastSigBits)
  val FORCE_NEWTON = new UUID((0x2723L << 32) | 0x1000, leastSigBits)
  val PRESSURE_PASCAL = new UUID((0x2724L << 32) | 0x1000, leastSigBits)
  val ENERGY_JOULE = new UUID((0x2725L << 32) | 0x1000, leastSigBits)
  val POWER_WATT = new UUID((0x2726L << 32) | 0x1000, leastSigBits)
  val ELECTRIC_CHARGE_COULOMB = new UUID((0x2727L << 32) | 0x1000, leastSigBits)
  val ELECTRIC_POTENTIAL_DIFFERENCE_VOLT = new UUID((0x2728L << 32) | 0x1000, leastSigBits)
  val CAPACITANCE_FARAD = new UUID((0x2729L << 32) | 0x1000, leastSigBits)
  val ELECTRIC_RESISTANCE_OHM = new UUID((0x272AL << 32) | 0x1000, leastSigBits)
  val ELECTRIC_CONDUCTANCE_SIEMENS = new UUID((0x272BL << 32) | 0x1000, leastSigBits)
  val MAGNETIC_FLEX_WEBER = new UUID((0x272CL << 32) | 0x1000, leastSigBits)
  val MAGNETIC_FLEX_DENSITY_TESLA = new UUID((0x272DL << 32) | 0x1000, leastSigBits)
  val INDUCTANCE_HENRY = new UUID((0x272EL << 32) | 0x1000, leastSigBits)
  val THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS = new UUID((0x272FL << 32) | 0x1000, leastSigBits)
  val LUMINOUS_FLUX_LUMEN = new UUID((0x2730L << 32) | 0x1000, leastSigBits)
  val ILLUMINANCE_LUX = new UUID((0x2731L << 32) | 0x1000, leastSigBits)
  val ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL = new UUID((0x2732L << 32) | 0x1000, leastSigBits)
  val ABSORBED_DOSE_GRAY = new UUID((0x2733L << 32) | 0x1000, leastSigBits)
  val DOSE_EQUIVALENT_SIEVERT = new UUID((0x2734L << 32) | 0x1000, leastSigBits)
  val CATALYTIC_ACTIVITY_KATAL = new UUID((0x2735L << 32) | 0x1000, leastSigBits)
  val DYNAMIC_VISCOSITY_PASCAL_SECOND = new UUID((0x2740L << 32) | 0x1000, leastSigBits)
  val MOMENT_OF_FORCE_NEWTON_METRE = new UUID((0x2741L << 32) | 0x1000, leastSigBits)
  val SURFACE_TENSION_NEWTON_PER_METRE = new UUID((0x2742L << 32) | 0x1000, leastSigBits)
  val ANGULAR_VELOCITY_RADIAN_PER_SECOND = new UUID((0x2743L << 32) | 0x1000, leastSigBits)
  val ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED = new UUID((0x2744L << 32) | 0x1000, leastSigBits)
  val HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE = new UUID((0x2745L << 32) | 0x1000, leastSigBits)
  val HEAT_CAPACITY_JOULE_PER_KELVIN = new UUID((0x2746L << 32) | 0x1000, leastSigBits)
  val SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN = new UUID((0x2747L << 32) | 0x1000, leastSigBits)
  val SPECIFIC_ENERGY_JOULE_PER_KILOGRAM = new UUID((0x2748L << 32) | 0x1000, leastSigBits)
  val THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN = new UUID((0x2749L << 32) | 0x1000, leastSigBits)
  val ENERGY_DENSITY_JOULE_PER_CUBIC_METRE = new UUID((0x274AL << 32) | 0x1000, leastSigBits)
  val ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE = new UUID((0x274BL << 32) | 0x1000, leastSigBits)
  val ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE = new UUID((0x274CL << 32) | 0x1000, leastSigBits)
  val SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE = new UUID((0x274DL << 32) | 0x1000, leastSigBits)
  val ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE = new UUID((0x274EL << 32) | 0x1000, leastSigBits)
  val PERMITTIVITY_FARAD_PER_METRE = new UUID((0x274FL << 32) | 0x1000, leastSigBits)
  val PERMEABILITY_HENRY_PER_METRE = new UUID((0x2750L << 32) | 0x1000, leastSigBits)
  val MOLAR_ENERGY_JOULE_PER_MOLE = new UUID((0x2751L << 32) | 0x1000, leastSigBits)
  val MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN = new UUID((0x2752L << 32) | 0x1000, leastSigBits)
  val EXPOSURE_COULOMB_PER_KILOGRAM = new UUID((0x2753L << 32) | 0x1000, leastSigBits)
  val ABSORBED_DOSE_RATE_GRAY_PER_SECOND = new UUID((0x2754L << 32) | 0x1000, leastSigBits)
  val RADIANT_INTENSITY_WATT_PER_STERADIAN = new UUID((0x2755L << 32) | 0x1000, leastSigBits)
  val RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN = new UUID((0x2756L << 32) | 0x1000, leastSigBits)
  val CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE = new UUID((0x2757L << 32) | 0x1000, leastSigBits)
  val TIME_MINUTE = new UUID((0x2760L << 32) | 0x1000, leastSigBits)
  val TIME_HOUR = new UUID((0x2761L << 32) | 0x1000, leastSigBits)
  val TIME_DAY = new UUID((0x2762L << 32) | 0x1000, leastSigBits)
  val PLANE_ANGLE_DEGREE = new UUID((0x2763L << 32) | 0x1000, leastSigBits)
  val PLANE_ANGLE_MINUTE = new UUID((0x2764L << 32) | 0x1000, leastSigBits)
  val PLANE_ANGLE_SECOND = new UUID((0x2765L << 32) | 0x1000, leastSigBits)
  val AREA_HECTARE = new UUID((0x2766L << 32) | 0x1000, leastSigBits)
  val VOLUME_LITRE = new UUID((0x2767L << 32) | 0x1000, leastSigBits)
  val MASS_TONNE = new UUID((0x2768L << 32) | 0x1000, leastSigBits)
  val PRESSURE_BAR = new UUID((0x2780L << 32) | 0x1000, leastSigBits)
  val PRESSURE_MILLIMETRE_OF_MERCURY = new UUID((0x2781L << 32) | 0x1000, leastSigBits)
  val LENGTH_ÅNGSTRÖM = new UUID((0x2782L << 32) | 0x1000, leastSigBits)
  val LENGTH_NAUTICAL_MILE = new UUID((0x2783L << 32) | 0x1000, leastSigBits)
  val AREA_BARN = new UUID((0x2784L << 32) | 0x1000, leastSigBits)
  val VELOCITY_KNOT = new UUID((0x2785L << 32) | 0x1000, leastSigBits)
  val LOGARITHMIC_RADIO_QUANTITY_NEPER = new UUID((0x2786L << 32) | 0x1000, leastSigBits)
  val LOGARITHMIC_RADIO_QUANTITY_BEL = new UUID((0x2787L << 32) | 0x1000, leastSigBits)
  val LENGTH_YARD = new UUID((0x27A0L << 32) | 0x1000, leastSigBits)
  val LENGTH_PARSEC = new UUID((0x27A1L << 32) | 0x1000, leastSigBits)
  val LENGTH_INCH = new UUID((0x27A2L << 32) | 0x1000, leastSigBits)
  val LENGTH_FOOT = new UUID((0x27A3L << 32) | 0x1000, leastSigBits)
  val LENGTH_MILE = new UUID((0x27A4L << 32) | 0x1000, leastSigBits)
  val PRESSURE_POUND_FORCE_PER_SQUARE_INCH = new UUID((0x27A5L << 32) | 0x1000, leastSigBits)
  val VELOCITY_KILOMETRE_PER_HOUR = new UUID((0x27A6L << 32) | 0x1000, leastSigBits)
  val VELOCITY_MILE_PER_HOUR = new UUID((0x27A7L << 32) | 0x1000, leastSigBits)
  val ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE = new UUID((0x27A8L << 32) | 0x1000, leastSigBits)
  val ENERGY_GRAM_CALORIE = new UUID((0x27A9L << 32) | 0x1000, leastSigBits)
  val ENERGY_KILOGRAM_CALORIE = new UUID((0x27AAL << 32) | 0x1000, leastSigBits)
  val ENERGY_KILOWATT_HOUR = new UUID((0x27ABL << 32) | 0x1000, leastSigBits)
  val THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT = new UUID((0x27ACL << 32) | 0x1000, leastSigBits)
  val PERCENTAGE = new UUID((0x27ADL << 32) | 0x1000, leastSigBits)
  val PER_MILLE = new UUID((0x27AEL << 32) | 0x1000, leastSigBits)
  val PERIOD_BEATS_PER_MINUTE = new UUID((0x27AFL << 32) | 0x1000, leastSigBits)
  val ELECTRIC_CHARGE_AMPERE_HOURS = new UUID((0x27B0L << 32) | 0x1000, leastSigBits)
  val MASS_DENSITY_MILLIGRAM_PER_DECILITRE = new UUID((0x27B1L << 32) | 0x1000, leastSigBits)
  val MASS_DENSITY_MILLIMOLE_PER_LITRE = new UUID((0x27B2L << 32) | 0x1000, leastSigBits)
  val TIME_YEAR = new UUID((0x27B3L << 32) | 0x1000, leastSigBits)
  val TIME_MONTH = new UUID((0x27B4L << 32) | 0x1000, leastSigBits)
  val CONCENTRAUTION_COUNT_PER_CUBIC_METRE = new UUID((0x27B5L << 32) | 0x1000, leastSigBits)
  val IRRADIANCE_WATT_PER_SQUARE_METRE = new UUID((0x27B6L << 32) | 0x1000, leastSigBits)
  val MILLILITER_PER_KILOGRAM_PER_MINUTE = new UUID((0x27B7L << 32) | 0x1000, leastSigBits)
  val POUND = new UUID((0x27B8L << 32) | 0x1000, leastSigBits)

  val attributes = HashMap[UUID, GattUnit](
    UNITLESS -> new GattUnit("", ""),
    LENGTH_METRE -> new GattUnit("m", "metre"),
    MASS_KILOGRAM -> new GattUnit("kg", "kilogram"),
    TIME_SECOND -> new GattUnit("s", "second"),
    ELECTRIC_CURRENT_AMPERE -> new GattUnit("A", "ampere"),
    THERMODYNAMIC_TEMPERATURE_KELVIN -> new GattUnit("K", "kelvin"),
    AMOUNT_OF_SUBSTANCE_MOLE -> new GattUnit("mol", "mole"),
    LUMINOUS_INTENSITY_CANDELA -> new GattUnit("cd", "cendela"),
    AREA_SQUARE_METRES -> new GattUnit("", "square metres"),
    VOLUME_CUBIC_METRES -> new GattUnit("", "cubic metres"),
    VELOCITY_METRES_PER_SECOND -> new GattUnit("", "metres per second"),
    ACCELERATION_METRES_PER_SECOND_SQUARED -> new GattUnit("", "metres per second squared"),
    WAVENUMBER_RECIPROCAL_METRE -> new GattUnit("", "reciprocal metre"),
    DENSITY_KILOGRAM_PER_CUBIC_METRE -> new GattUnit("", "kilogram per cubic metre"),
    SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE -> new GattUnit("", "kilogram per square metre"),
    SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM -> new GattUnit("", "cubic metre per kilogram"),
    CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE -> new GattUnit("", "ampere per square metre"),
    MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE -> new GattUnit("", "ampere per metre"),
    AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE -> new GattUnit("", "mole per cubic metre"),
    MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE -> new GattUnit("", "kilogram per cubic metre"),
    LUMINANCE_CANDELA_PER_SQUARE_METRE -> new GattUnit("", "candela per square metre"),
    REFRACTIVE_INDEX -> new GattUnit("", "refractive index"),
    RELATIVE_PERMEABILITY -> new GattUnit("", "relative permeability"),
    PLANE_ANGLE_RADIAN -> new GattUnit("rad", "radian"),
    SOLID_ANGLE_STERADIAN -> new GattUnit("sr", "steradian"),
    FREQUENCY_HERTZ -> new GattUnit("Hz", "hertz"),
    FORCE_NEWTON -> new GattUnit("N", "newton"),
    PRESSURE_PASCAL -> new GattUnit("Pa", "pascal"),
    ENERGY_JOULE -> new GattUnit("J", "joule"),
    POWER_WATT -> new GattUnit("W", "watt"),
    ELECTRIC_CHARGE_COULOMB -> new GattUnit("C", "coulomb"),
    ELECTRIC_POTENTIAL_DIFFERENCE_VOLT -> new GattUnit("V", "volt"),
    CAPACITANCE_FARAD -> new GattUnit("F", "farad"),
    ELECTRIC_RESISTANCE_OHM -> new GattUnit("", "ohm"),
    ELECTRIC_CONDUCTANCE_SIEMENS -> new GattUnit("S", "siemens"),
    MAGNETIC_FLEX_WEBER -> new GattUnit("Wb", "weber"),
    MAGNETIC_FLEX_DENSITY_TESLA -> new GattUnit("T", "tesla"),
    INDUCTANCE_HENRY -> new GattUnit("H", "henry"),
    THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS -> new GattUnit("�C", "Celsius"),
    LUMINOUS_FLUX_LUMEN -> new GattUnit("lm", "lumen"),
    ILLUMINANCE_LUX -> new GattUnit("lx", "lux"),
    ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL -> new GattUnit("Bq", "becquerel"),
    ABSORBED_DOSE_GRAY -> new GattUnit("Gy", "gray"),
    DOSE_EQUIVALENT_SIEVERT -> new GattUnit("Sv", "sievert"),
    CATALYTIC_ACTIVITY_KATAL -> new GattUnit("kat", "katal"),
    DYNAMIC_VISCOSITY_PASCAL_SECOND -> new GattUnit("", "pascal second"),
    MOMENT_OF_FORCE_NEWTON_METRE -> new GattUnit("", "newton metre"),
    SURFACE_TENSION_NEWTON_PER_METRE -> new GattUnit("", "newton per metre"),
    ANGULAR_VELOCITY_RADIAN_PER_SECOND -> new GattUnit("", "radian per second"),
    ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED -> new GattUnit("", "radian per second squared"),
    HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE -> new GattUnit("", "watt per square metre"),
    HEAT_CAPACITY_JOULE_PER_KELVIN -> new GattUnit("", "joule per kelvin"),
    SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN -> new GattUnit("", "joule per kilogram kelvin"),
    SPECIFIC_ENERGY_JOULE_PER_KILOGRAM -> new GattUnit("", "joule per kilogram"),
    THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN -> new GattUnit("", "watt per metre kelvin"),
    ENERGY_DENSITY_JOULE_PER_CUBIC_METRE -> new GattUnit("", "joule per cubic metre"),
    ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE -> new GattUnit("", "volt per metre"),
    ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE -> new GattUnit("", "coulomb per cubic metre"),
    SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE -> new GattUnit("", "coulomb per square metre"),
    ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE -> new GattUnit("", "coulomb per square metre"),
    PERMITTIVITY_FARAD_PER_METRE -> new GattUnit("", "farad per metre"),
    PERMEABILITY_HENRY_PER_METRE -> new GattUnit("", "henry per metre"),
    MOLAR_ENERGY_JOULE_PER_MOLE -> new GattUnit("", "joule per mole"),
    MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN -> new GattUnit("", "joule per mole kelvin"),
    EXPOSURE_COULOMB_PER_KILOGRAM -> new GattUnit("", "coulomb per kilogram"),
    ABSORBED_DOSE_RATE_GRAY_PER_SECOND -> new GattUnit("", "gray per second"),
    RADIANT_INTENSITY_WATT_PER_STERADIAN -> new GattUnit("", "watt per steradian"),
    RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN -> new GattUnit("", "watt per square metre steradian"),
    CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE -> new GattUnit("", "katal per cubic metre"),
    TIME_MINUTE -> new GattUnit("", "minute"),
    TIME_HOUR -> new GattUnit("", "hour"),
    TIME_DAY -> new GattUnit("", "day"),
    PLANE_ANGLE_DEGREE -> new GattUnit("", "degree"),
    PLANE_ANGLE_MINUTE -> new GattUnit("", "minute"),
    PLANE_ANGLE_SECOND -> new GattUnit("", "second"),
    AREA_HECTARE -> new GattUnit("Ha", "hectare"),
    VOLUME_LITRE -> new GattUnit("L", "litre"),
    MASS_TONNE -> new GattUnit("ton", "tonne"),
    PRESSURE_BAR -> new GattUnit("", "bar"),
    PRESSURE_MILLIMETRE_OF_MERCURY -> new GattUnit("", "millimetre of mercury"),
    LENGTH_ÅNGSTRÖM -> new GattUnit("", "ångström"),
    LENGTH_NAUTICAL_MILE -> new GattUnit("", "nautical mile"),
    AREA_BARN -> new GattUnit("", "barn"),
    VELOCITY_KNOT -> new GattUnit("", "knot"),
    LOGARITHMIC_RADIO_QUANTITY_NEPER -> new GattUnit("", "neper"),
    LOGARITHMIC_RADIO_QUANTITY_BEL -> new GattUnit("", "bel"),
    LENGTH_YARD -> new GattUnit("", "yard"),
    LENGTH_PARSEC -> new GattUnit("", "parsec"),
    LENGTH_INCH -> new GattUnit("", "inch"),
    LENGTH_FOOT -> new GattUnit("", "foot"),
    LENGTH_MILE -> new GattUnit("", "mile"),
    PRESSURE_POUND_FORCE_PER_SQUARE_INCH -> new GattUnit("", "pound-force per square inch"),
    VELOCITY_KILOMETRE_PER_HOUR -> new GattUnit("", "kilometre per hour"),
    VELOCITY_MILE_PER_HOUR -> new GattUnit("", "mile per hour"),
    ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE -> new GattUnit("", "revolution per minute"),
    ENERGY_GRAM_CALORIE -> new GattUnit("", "gram calorie"),
    ENERGY_KILOGRAM_CALORIE -> new GattUnit("", "kilogram calorie"),
    ENERGY_KILOWATT_HOUR -> new GattUnit("", "kilowatt hour"),
    THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT -> new GattUnit("", "degree Fahrenheit"),
    PERCENTAGE -> new GattUnit("%", "percentage"),
    PER_MILLE -> new GattUnit("", "per mille"),
    PERIOD_BEATS_PER_MINUTE -> new GattUnit("", "beats per minut"),
    ELECTRIC_CHARGE_AMPERE_HOURS -> new GattUnit("", "ampere hours"),
    MASS_DENSITY_MILLIGRAM_PER_DECILITRE -> new GattUnit("", "milligram per decilitre"),
    MASS_DENSITY_MILLIMOLE_PER_LITRE -> new GattUnit("", "millimole per litre"),
    TIME_YEAR -> new GattUnit("", "year"),
    TIME_MONTH -> new GattUnit("", "month"),
    CONCENTRAUTION_COUNT_PER_CUBIC_METRE -> new GattUnit("", "count per cubic metre"),
    IRRADIANCE_WATT_PER_SQUARE_METRE -> new GattUnit("", "watt per square metre"),
    MILLILITER_PER_KILOGRAM_PER_MINUTE -> new GattUnit("", "milliliter (per kilogram per minute)"),
    POUND -> new GattUnit("", "mass pound")
  )

  def lookup(uuid: UUID, defaultUnit: GattUnit = new GattUnit("", "")): GattUnit = {
    attributes.get(uuid) match {
      case Some(gattUnit) => gattUnit
      case None => defaultUnit
    }
  }

  def find(uuid: UUID): Option[GattUnit] = attributes.get(uuid)

}