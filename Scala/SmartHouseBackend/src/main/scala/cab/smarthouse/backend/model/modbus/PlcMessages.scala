/** ********************************************
 * o-o                 o      o  o
 * |                    |      |  |
 * o-o  o-O-o  oo o-o -o-     O--O o-o o  o o-o
 * | | | | | | |    |      |  | | | |  |  \
 * o--o  o o o o-o-o    o      o  o o-o o--o o-o
 *
 * author: CAB
 * website: github.com/alexcab
 * created: 2023-02-02
 * ******************************************** */


package cab.smarthouse.backend.model.modbus


final case class U1_R_000_PLC_status(value: Option[Int] = None)
  extends ModbusRegister[U1_R_000_PLC_status]

final case class U1_C_0000_work_ok(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0000_work_ok]

final case class U1_C_0001_state_updated(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0001_state_updated]

final case class U1_C_0008_config_loaded(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0008_config_loaded]

final case class U1_R_001_light_switches_and_config(value: Option[Int] = None)
  extends ModbusRegister[U1_R_001_light_switches_and_config]

final case class U1_C_0016_room_light_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0016_room_light_on]

final case class U1_C_0018_loggia_light_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0018_loggia_light_on]

final case class U1_C_0019_kitchen_light_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0019_kitchen_light_on]

final case class U1_C_0020_hall_light_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0020_hall_light_on]

final case class U1_C_0021_bathroom_light_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0021_bathroom_light_on]

final case class U1_C_0024_room_light_auto(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0024_room_light_auto]

final case class U1_C_0025_light_error(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0025_light_error]

final case class U1_R_002_room_light_intensity(value: Option[Int] = None)
  extends ModbusRegister[U1_R_002_room_light_intensity]

final case class U1_R_003_room_light_ratio(value: Option[Int] = None)
  extends ModbusRegister[U1_R_003_room_light_ratio]

final case class U1_R_004_loggia_light_intensity(value: Option[Int] = None)
  extends ModbusRegister[U1_R_004_loggia_light_intensity]

final case class U1_R_005_kitchen_light_intensity(value: Option[Int] = None)
  extends ModbusRegister[U1_R_005_kitchen_light_intensity]

final case class U1_R_006_hall_light_intensity(value: Option[Int] = None)
  extends ModbusRegister[U1_R_006_hall_light_intensity]

final case class U1_R_007_bathroom_light_intensity(value: Option[Int] = None)
  extends ModbusRegister[U1_R_007_bathroom_light_intensity]

final case class U1_R_008_room_light_change_rate(value: Option[Int] = None)
  extends ModbusRegister[U1_R_008_room_light_change_rate]

final case class U1_R_009_other_light_change_rate(value: Option[Int] = None)
  extends ModbusRegister[U1_R_009_other_light_change_rate]

final case class U1_R_010_room_light_intensity_in_auto(value: Option[Int] = None)
  extends ModbusRegister[U1_R_010_room_light_intensity_in_auto]

final case class U1_F_012_room_luminosity(value: Option[Float] = None)
  extends ModbusFloat[U1_F_012_room_luminosity]

final case class U1_R_014_room_luminosity_sensor_status(value: Option[Int] = None)
  extends ModbusRegister[U1_R_014_room_luminosity_sensor_status]

final case class U1_R_015_sockets_power_control_and_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_015_sockets_power_control_and_state]

final case class U1_C_0240_room_sockets_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0240_room_sockets_on]

final case class U1_C_0241_logia_kitchen_center_sockets_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0241_logia_kitchen_center_sockets_on]

final case class U1_C_0242_holl_bathroom_sockets_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0242_holl_bathroom_sockets_on]

final case class U1_C_0243_kitchen_microwaive_socket_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0243_kitchen_microwaive_socket_on]

final case class U1_C_0244_kitchen_refrigerator_socket_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0244_kitchen_refrigerator_socket_on]

final case class U1_C_0248_room_sockets_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0248_room_sockets_active]

final case class U1_C_0249_logia_kitchen_center_sockets_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0249_logia_kitchen_center_sockets_active]

final case class U1_C_0250_holl_bathroom_sockets_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0250_holl_bathroom_sockets_active]

final case class U1_C_0251_kitchen_microwaive_socket_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0251_kitchen_microwaive_socket_active]

final case class U1_C_0252_kitchen_refrigerator_socket_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0252_kitchen_refrigerator_socket_active]

final case class U1_R_016_appliances_power_control_and_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_016_appliances_power_control_and_state]

final case class U1_C_0256_conditioner_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0256_conditioner_power_on]

final case class U1_C_0257_autowatering_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0257_autowatering_power_on]

final case class U1_C_0258_kitchen_hood_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0258_kitchen_hood_power_on]

final case class U1_C_0259_brizer_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0259_brizer_power_on]

final case class U1_C_0260_boiler_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0260_boiler_power_on]

final case class U1_C_0261_washing_machine_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0261_washing_machine_power_on]

final case class U1_C_0262_toilet_power_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0262_toilet_power_on]

final case class U1_C_0264_conditioner_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0264_conditioner_power_active]

final case class U1_C_0265_autowatering_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0265_autowatering_power_active]

final case class U1_C_0266_kitchen_hood_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0266_kitchen_hood_power_active]

final case class U1_C_0267_brizer_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0267_brizer_power_active]

final case class U1_C_0268_boiler_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0268_boiler_power_active]

final case class U1_C_0269_washing_machine_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0269_washing_machine_power_active]

final case class U1_C_0270_toilet_power_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0270_toilet_power_active]

final case class U1_R_017_water_valves_and_security(value: Option[Int] = None)
  extends ModbusRegister[U1_R_017_water_valves_and_security]

final case class U1_C_0272_cold_water_open(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0272_cold_water_open]

final case class U1_C_0273_hot_water_open(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0273_hot_water_open]

final case class U1_C_0276_bathroom_water_leack_detected(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0276_bathroom_water_leack_detected]

final case class U1_C_0277_kitchen_water_leack_detected(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0277_kitchen_water_leack_detected]

final case class U1_C_0280_security_armed(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0280_security_armed]

final case class U1_C_0281_main_door_lock_closed(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0281_main_door_lock_closed]

final case class U1_C_0283_alarm_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0283_alarm_on]

final case class U1_C_0284_room_window_closed(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0284_room_window_closed]

final case class U1_C_0285_logia_window_closed(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0285_logia_window_closed]

final case class U1_C_0286_main_door_closed(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0286_main_door_closed]

final case class U1_R_018_security_and_doorbell(value: Option[Int] = None)
  extends ModbusRegister[U1_R_018_security_and_doorbell]

final case class U1_C_0288_arm_security(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0288_arm_security]

final case class U1_C_0289_siren_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0289_siren_enabled]

final case class U1_C_0290_close_main_door_lock(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0290_close_main_door_lock]

final case class U1_C_0291_turn_on_siren(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0291_turn_on_siren]

final case class U1_C_0296_doorbell_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0296_doorbell_enabled]

final case class U1_C_0297_doorbell_button_active(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0297_doorbell_button_active]

final case class U1_C_0298_doorbell_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0298_doorbell_on]

final case class U1_F_020_electric_box_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_020_electric_box_temperature]

final case class U1_R_022_electric_box_termometer_status(value: Option[Int] = None)
  extends ModbusRegister[U1_R_022_electric_box_termometer_status]

final case class U1_R_023_ventilation_switches_and_power_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_023_ventilation_switches_and_power_state]

final case class U1_C_0368_room_ventilation_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0368_room_ventilation_on]

final case class U1_C_0369_room_ventilation_fast(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0369_room_ventilation_fast]

final case class U1_C_0370_bathroom_ventilation_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0370_bathroom_ventilation_on]

final case class U1_C_0371_bathroom_ventilation_fast(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0371_bathroom_ventilation_fast]

final case class U1_C_0376_power_f1_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0376_power_f1_on]

final case class U1_C_0377_power_f2_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0377_power_f2_on]

final case class U1_C_0378_power_f3_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0378_power_f3_on]

final case class U1_R_024_warm_floor_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_024_warm_floor_state]

final case class U1_C_0391_warm_floor_sensor_error(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0391_warm_floor_sensor_error]

final case class U1_R_025_room_warm_floor_sensor_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_025_room_warm_floor_sensor_state]

final case class U1_R_026_logia_warm_floor_sensor_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_026_logia_warm_floor_sensor_state]

final case class U1_R_027_kitchen_warm_floor_sensor_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_027_kitchen_warm_floor_sensor_state]

final case class U1_R_028_hall_warm_floor_sensor_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_028_hall_warm_floor_sensor_state]

final case class U1_R_029_bathroom_warm_floor_sensor_state(value: Option[Int] = None)
  extends ModbusRegister[U1_R_029_bathroom_warm_floor_sensor_state]

final case class U1_F_030_room_warm_floor_tempersture(value: Option[Float] = None)
  extends ModbusFloat[U1_F_030_room_warm_floor_tempersture]

final case class U1_F_032_logia_warm_floor_tempersture(value: Option[Float] = None)
  extends ModbusFloat[U1_F_032_logia_warm_floor_tempersture]

final case class U1_F_034_kitchen_warm_floor_tempersture(value: Option[Float] = None)
  extends ModbusFloat[U1_F_034_kitchen_warm_floor_tempersture]

final case class U1_F_036_hall_warm_floor_tempersture(value: Option[Float] = None)
  extends ModbusFloat[U1_F_036_hall_warm_floor_tempersture]

final case class U1_F_038_bathroom_warm_floor_tempersture(value: Option[Float] = None)
  extends ModbusFloat[U1_F_038_bathroom_warm_floor_tempersture]

final case class U1_R_042_warm_floor_on(value: Option[Int] = None)
  extends ModbusRegister[U1_R_042_warm_floor_on]

final case class U1_C_0672_room_warm_floor_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0672_room_warm_floor_on]

final case class U1_C_0673_logia_warm_floor_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0673_logia_warm_floor_on]

final case class U1_C_0674_kitchen_warm_floor_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0674_kitchen_warm_floor_on]

final case class U1_C_0675_hall_warm_floor_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0675_hall_warm_floor_on]

final case class U1_C_0676_bathroom_warm_floor_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0676_bathroom_warm_floor_on]

final case class U1_F_044_room_warm_floor_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_044_room_warm_floor_set_temperature]

final case class U1_F_046_logia_warm_floor_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_046_logia_warm_floor_set_temperature]

final case class U1_F_048_kitchen_warm_floor_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_048_kitchen_warm_floor_set_temperature]

final case class U1_F_050_hall_warm_floor_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_050_hall_warm_floor_set_temperature]

final case class U1_F_052_bathroom_warm_floor_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_052_bathroom_warm_floor_set_temperature]

final case class U1_F_056_room_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_056_room_temperature]

final case class U1_F_058_room_humidity(value: Option[Float] = None)
  extends ModbusFloat[U1_F_058_room_humidity]

final case class U1_R_060_room_sensors_status(value: Option[Int] = None)
  extends ModbusRegister[U1_R_060_room_sensors_status]

final case class U1_C_0960_room_temperature_sensor_error(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0960_room_temperature_sensor_error]

final case class U1_C_0961_room_humidity_sensor_error(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_0961_room_humidity_sensor_error]

final case class U1_F_062_bathroom_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_062_bathroom_temperature]

final case class U1_F_064_bathroom_humidity(value: Option[Float] = None)
  extends ModbusFloat[U1_F_064_bathroom_humidity]

final case class U1_R_066_bathroom_sensors_status(value: Option[Int] = None)
  extends ModbusRegister[U1_R_066_bathroom_sensors_status]

final case class U1_C_1056_bathroom_temperature_sensor_error(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1056_bathroom_temperature_sensor_error]

final case class U1_C_1057_bathroom_humidity_sensor_error(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1057_bathroom_humidity_sensor_error]

final case class U1_F_068_outdoor_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_068_outdoor_temperature]

final case class U1_R_070_outdoor_termometer_status(value: Option[Int] = None)
  extends ModbusRegister[U1_R_070_outdoor_termometer_status]

final case class U1_R_072_warm_floor_auto_enabled(value: Option[Int] = None)
  extends ModbusRegister[U1_R_072_warm_floor_auto_enabled]

final case class U1_C_1152_room_warm_floor_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1152_room_warm_floor_auto_enabled]

final case class U1_C_1153_logia_warm_floor_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1153_logia_warm_floor_auto_enabled]

final case class U1_C_1154_kitchen_warm_floor_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1154_kitchen_warm_floor_auto_enabled]

final case class U1_C_1155_hall_warm_floor_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1155_hall_warm_floor_auto_enabled]

final case class U1_C_1156_bathroom_warm_floor_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1156_bathroom_warm_floor_auto_enabled]

final case class U1_F_074_room_warm_floor_auto_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_074_room_warm_floor_auto_set_temperature]

final case class U1_F_076_logia_warm_floor_auto_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_076_logia_warm_floor_auto_set_temperature]

final case class U1_F_078_kitchen_warm_floor_auto_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_078_kitchen_warm_floor_auto_set_temperature]

final case class U1_F_080_hall_warm_floor_auto_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_080_hall_warm_floor_auto_set_temperature]

final case class U1_F_082_bathroom_warm_floor_auto_set_temperature(value: Option[Float] = None)
  extends ModbusFloat[U1_F_082_bathroom_warm_floor_auto_set_temperature]

final case class U1_F_086_room_warm_floor_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_086_room_warm_floor_auto_influence]

final case class U1_F_088_logia_warm_floor_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_088_logia_warm_floor_auto_influence]

final case class U1_F_090_kitchen_warm_floor_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_090_kitchen_warm_floor_auto_influence]

final case class U1_F_092_hall_warm_floor_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_092_hall_warm_floor_auto_influence]

final case class U1_F_094_bathroom_warm_floor_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_094_bathroom_warm_floor_auto_influence]

final case class U1_R_098_converter_fan_on(value: Option[Int] = None)
  extends ModbusRegister[U1_R_098_converter_fan_on]

final case class U1_C_1568_room_converter_fan_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1568_room_converter_fan_on]

final case class U1_C_1569_logia_converter_fan_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1569_logia_converter_fan_on]

final case class U1_R_100_room_converter_set_fan_speed(value: Option[Int] = None)
  extends ModbusRegister[U1_R_100_room_converter_set_fan_speed]

final case class U1_R_101_logia_converter_set_fan_speed(value: Option[Int] = None)
  extends ModbusRegister[U1_R_101_logia_converter_set_fan_speed]

final case class U1_R_104_0_converter_auto_enabled(value: Option[Int] = None)
  extends ModbusRegister[U1_R_104_0_converter_auto_enabled]

final case class U1_C_1664_room_converter_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1664_room_converter_auto_enabled]

final case class U1_C_1665_logia_converter_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1665_logia_converter_auto_enabled]

final case class U1_R_106_room_converter_auto_set_fan_speed(value: Option[Int] = None)
  extends ModbusRegister[U1_R_106_room_converter_auto_set_fan_speed]

final case class U1_R_107_logia_converter_autor_set_fan_speed(value: Option[Int] = None)
  extends ModbusRegister[U1_R_107_logia_converter_autor_set_fan_speed]

final case class U1_F_110_room_converter_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_110_room_converter_auto_influence]

final case class U1_F_112_logia_converter_auto_influence(value: Option[Float] = None)
  extends ModbusFloat[U1_F_112_logia_converter_auto_influence]

final case class U1_R_114_ventilation_on_speed(value: Option[Int] = None)
  extends ModbusRegister[U1_R_114_ventilation_on_speed]

final case class U1_C_1824_room_ventilation_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1824_room_ventilation_on]

final case class U1_C_1825_room_ventilation_fast(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1825_room_ventilation_fast]

final case class U1_C_1826_bathroom_ventilation_on(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1826_bathroom_ventilation_on]

final case class U1_C_1827_bathroom_ventilation_fast(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1827_bathroom_ventilation_fast]

final case class U1_R_116_ventilation_auto_enabled(value: Option[Int] = None)
  extends ModbusRegister[U1_R_116_ventilation_auto_enabled]

final case class U1_C_1856_room_ventilation_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1856_room_ventilation_auto_enabled]

final case class U1_C_1857_bathroom_ventilation_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1857_bathroom_ventilation_auto_enabled]

final case class U1_C_1859_room_ventilation_reset_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1859_room_ventilation_reset_auto_enabled]

final case class U1_C_1860_bathroom_ventilation_reset_auto_enabled(value: Option[Boolean] = None)
  extends ModbusCoil[U1_C_1860_bathroom_ventilation_reset_auto_enabled]

final case class U1_F_118_room_ventilation_humidity_slow(value: Option[Float] = None)
  extends ModbusFloat[U1_F_118_room_ventilation_humidity_slow]

final case class U1_F_120_room_ventilation_humidity_fast(value: Option[Float] = None)
  extends ModbusFloat[U1_F_120_room_ventilation_humidity_fast]

final case class U1_F_122_bathroom_ventilation_humidity_slow(value: Option[Float] = None)
  extends ModbusFloat[U1_F_122_bathroom_ventilation_humidity_slow]

final case class U1_F_124_bathroom_ventilation_humidity_fast(value: Option[Float] = None)
  extends ModbusFloat[U1_F_124_bathroom_ventilation_humidity_fast]

final case class U1_F_128_room_dew_point(value: Option[Float] = None)
  extends ModbusFloat[U1_F_128_room_dew_point]

final case class U1_F_130_bathroom_dew_point(value: Option[Float] = None)
  extends ModbusFloat[U1_F_130_bathroom_dew_point]

final case class U1_F_134_room_temperature_set(value: Option[Float] = None)
  extends ModbusFloat[U1_F_134_room_temperature_set]

final case class U1_F_136_bathroom_temperature_set(value: Option[Float] = None)
  extends ModbusFloat[U1_F_136_bathroom_temperature_set]
