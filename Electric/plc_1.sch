EESchema Schematic File Version 4
EELAYER 30 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 1 1
Title "ПЛК, лист 1"
Date "2021-06-18"
Rev "1"
Comp ""
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
Text GLabel 700  1100 1    50   Input ~ 0
C_N1
Text GLabel 900  1100 1    50   Input ~ 0
C_F1
$Comp
L Device:CircuitBreaker_1P CBС1_2
U 1 1 60E1D671
P 1650 1800
F 0 "CBС1_2" V 1500 1700 50  0000 C CNN
F 1 "6А" V 1500 2050 50  0000 C CNN
F 2 "" H 1650 1800 50  0001 C CNN
F 3 "~" H 1650 1800 50  0001 C CNN
	1    1650 1800
	0    -1   1    0   
$EndComp
Text GLabel 6650 1100 1    50   Input ~ 0
PLC_24V
Text GLabel 3300 900  1    50   Input ~ 0
P+_PLC
Text GLabel 7000 1100 1    50   Input ~ 0
PLC_RS-485
$Comp
L plc_1-rescue:ПЛК110-60[М02]-plc U1
U 1 1 6217DA5C
P 5100 1800
F 0 "U1" H 5100 2115 50  0000 C CNN
F 1 "ПЛК110-60[М02]" H 5100 2024 50  0000 C CNN
F 2 "" H 5100 1800 50  0001 C CNN
F 3 "" H 5100 1800 50  0001 C CNN
	1    5100 1800
	1    0    0    -1  
$EndComp
Entry Wire Line
	6550 2000 6650 1900
Entry Wire Line
	6550 1900 6650 1800
Entry Wire Line
	6900 2200 7000 2100
Entry Wire Line
	6900 2300 7000 2200
Wire Wire Line
	1950 1800 2000 1800
Text GLabel 1250 2600 0    50   Input ~ 0
K2_J_K
Text GLabel 1250 2800 0    50   Input ~ 0
K2_J_L
Wire Wire Line
	4150 2300 4250 2300
Wire Wire Line
	4250 2200 4150 2200
Wire Wire Line
	4150 2200 4150 2300
Wire Wire Line
	5950 2200 6900 2200
Wire Wire Line
	5950 2300 6900 2300
Entry Wire Line
	2600 2500 2700 2400
Entry Wire Line
	2600 2600 2700 2500
Entry Wire Line
	2600 2700 2700 2600
Entry Wire Line
	2600 2800 2700 2700
Entry Wire Line
	2600 3000 2700 2900
Entry Wire Line
	2700 3200 2800 3100
Entry Wire Line
	3000 3100 3100 3000
Entry Wire Line
	3000 3200 3100 3100
Entry Wire Line
	3000 3300 3100 3200
Wire Bus Line
	2600 2500 2600 2600
Wire Bus Line
	2600 2700 2600 2800
Entry Wire Line
	1400 2600 1500 2500
Entry Wire Line
	1400 2800 1500 2700
Wire Wire Line
	1500 2700 1600 2700
Wire Wire Line
	1600 2700 1600 2500
Wire Wire Line
	1500 2500 1600 2500
Connection ~ 1600 2500
Wire Wire Line
	2700 2400 4250 2400
Wire Wire Line
	2700 2500 4250 2500
Wire Wire Line
	2700 2600 4250 2600
Wire Wire Line
	2700 2700 4250 2700
Text GLabel 1250 3000 0    50   Input ~ 0
K1_V_V
Text GLabel 1250 3200 0    50   Input ~ 0
K1_V_K
Entry Wire Line
	1400 3000 1500 2900
Entry Wire Line
	1400 3200 1500 3100
Wire Wire Line
	1600 2700 1600 2900
Wire Wire Line
	1600 2900 1500 2900
Connection ~ 1600 2700
Wire Wire Line
	1600 2900 1600 3100
Wire Wire Line
	1600 3100 1500 3100
Connection ~ 1600 2900
Wire Wire Line
	4250 2800 2800 2800
Wire Wire Line
	2900 2900 2900 3100
Wire Wire Line
	4250 2900 2900 2900
Wire Wire Line
	2800 2900 2700 2900
Wire Wire Line
	2800 2800 2800 2900
Wire Wire Line
	2800 3100 2900 3100
Text GLabel 1250 4100 0    50   Input ~ 0
C1_V
Entry Wire Line
	3000 3400 3100 3300
Entry Wire Line
	3000 3500 3100 3400
Entry Wire Line
	3000 3600 3100 3500
Entry Wire Line
	3000 3700 3100 3600
Entry Wire Line
	3000 3800 3100 3700
Entry Wire Line
	3000 3900 3100 3800
Entry Wire Line
	3000 4000 3100 3900
Entry Wire Line
	1400 4100 1500 4000
Wire Wire Line
	1600 4000 1500 4000
Connection ~ 1600 3100
Wire Wire Line
	3100 3000 4250 3000
Wire Wire Line
	3100 3100 4250 3100
Wire Wire Line
	4250 3200 3100 3200
Wire Wire Line
	3100 3300 4250 3300
Wire Wire Line
	4250 3400 3100 3400
Wire Wire Line
	3100 3500 4250 3500
Wire Wire Line
	4250 3600 3100 3600
Wire Wire Line
	4250 3700 3100 3700
Wire Wire Line
	3100 3800 4250 3800
Wire Wire Line
	4250 3900 3100 3900
Entry Wire Line
	3100 4100 3200 4000
Text GLabel 1250 4500 0    50   Input ~ 0
B1_K
Entry Wire Line
	3100 4200 3200 4100
Entry Wire Line
	3100 4300 3200 4200
Entry Wire Line
	3100 4400 3200 4300
Entry Wire Line
	1400 4500 1500 4400
Wire Wire Line
	1600 4400 1500 4400
Wire Wire Line
	3200 4000 4250 4000
Wire Wire Line
	3200 4100 4250 4100
Wire Wire Line
	3200 4200 4250 4200
Wire Wire Line
	3200 4300 4250 4300
Text GLabel 1250 4700 0    50   Input ~ 0
B1_P
Entry Wire Line
	3200 4500 3300 4400
Entry Wire Line
	3200 4600 3300 4500
Connection ~ 1600 4000
Wire Wire Line
	1600 3100 1600 4000
Wire Wire Line
	1600 4000 1600 4400
Wire Wire Line
	3300 4400 4250 4400
Wire Wire Line
	3300 4500 4250 4500
Entry Wire Line
	1400 4700 1500 4600
Wire Wire Line
	1600 4400 1600 4600
Wire Wire Line
	1600 4600 1500 4600
Connection ~ 1600 4400
Wire Wire Line
	5950 4950 6300 4950
Wire Wire Line
	5950 4400 6300 4400
Connection ~ 6300 4400
Wire Wire Line
	6300 4400 6300 4950
Text GLabel 10150 4000 2    50   Input ~ 0
ТП_К1
Entry Wire Line
	7100 5600 7200 5500
Text GLabel 10150 5750 2    50   Input ~ 0
24V_ON
Text GLabel 10150 2900 2    50   Input ~ 0
Р1_C
Entry Wire Line
	6900 5350 7000 5250
Entry Wire Line
	6900 5250 7000 5150
Entry Wire Line
	6900 5150 7000 5050
Entry Wire Line
	6900 5050 7000 4950
Wire Wire Line
	5950 4050 6300 4050
Wire Wire Line
	6300 4050 6300 4400
Text GLabel 10150 4650 2    50   Input ~ 0
L1_K
Text GLabel 3450 900  1    50   Input ~ 0
P-_PLC
$Comp
L Converter_ACDC:HLK-PM01 PS?
U 1 1 60DF4360
P 2500 1900
F 0 "PS?" H 2500 2225 50  0000 C CNN
F 1 "HLK-PM01" H 2500 2134 50  0000 C CNN
F 2 "Converter_ACDC:Converter_ACDC_HiLink_HLK-PMxx" H 2500 1600 50  0001 C CNN
F 3 "http://www.hlktech.net/product_detail.php?ProId=54" H 2900 1550 50  0001 C CNN
	1    2500 1900
	1    0    0    -1  
$EndComp
Wire Wire Line
	2900 2000 3450 2000
Connection ~ 3450 2000
Wire Wire Line
	2900 1800 3300 1800
Wire Wire Line
	900  1800 1350 1800
Text GLabel 10150 5450 2    50   Input ~ 0
Р2_C
Entry Wire Line
	7100 5700 7200 5600
Entry Wire Line
	7100 5800 7200 5700
Entry Wire Line
	7100 5900 7200 5800
Entry Wire Line
	7100 6150 7200 6050
Entry Wire Line
	7100 6250 7200 6150
Entry Wire Line
	7100 6350 7200 6250
Wire Wire Line
	900  1100 900  1800
Wire Wire Line
	700  1100 700  2000
Wire Wire Line
	6300 4950 6300 5500
Wire Wire Line
	6300 6050 5950 6050
Connection ~ 6300 4950
Wire Wire Line
	5950 5500 6300 5500
Connection ~ 6300 5500
Wire Wire Line
	6300 5500 6300 6050
Wire Wire Line
	7400 6450 7400 5750
Entry Wire Line
	6900 4800 7000 4700
Entry Wire Line
	6700 4700 6800 4600
Entry Wire Line
	6700 4600 6800 4500
Entry Wire Line
	6700 4500 6800 4400
Entry Wire Line
	6700 4250 6800 4150
Entry Wire Line
	6700 4150 6800 4050
Entry Wire Line
	6500 3900 6600 3800
Entry Wire Line
	6500 3800 6600 3700
Entry Wire Line
	6500 3550 6600 3450
Entry Wire Line
	6500 3300 6600 3200
Entry Wire Line
	6500 3050 6600 2950
Wire Wire Line
	5950 3050 6500 3050
Wire Wire Line
	5950 3300 6500 3300
Wire Wire Line
	5950 3550 6500 3550
Wire Wire Line
	5950 3800 6500 3800
Wire Wire Line
	5950 3900 6500 3900
Wire Wire Line
	5950 4150 6700 4150
Wire Wire Line
	5950 4250 6700 4250
Wire Wire Line
	5950 4500 6700 4500
Wire Wire Line
	5950 4600 6700 4600
Wire Wire Line
	5950 4700 6700 4700
Wire Wire Line
	5950 4800 6900 4800
Wire Wire Line
	5950 5050 6900 5050
Wire Wire Line
	5950 5150 6900 5150
Wire Wire Line
	5950 5250 6900 5250
Wire Wire Line
	5950 5350 6900 5350
Wire Wire Line
	5950 5600 7100 5600
Wire Wire Line
	5950 5700 7100 5700
Wire Wire Line
	5950 5800 7100 5800
Wire Wire Line
	5950 5900 7100 5900
Wire Wire Line
	5950 6150 7100 6150
Wire Wire Line
	5950 6250 7100 6250
Wire Wire Line
	5950 6350 7100 6350
Wire Wire Line
	5950 6450 7400 6450
Wire Wire Line
	7400 5750 10150 5750
Wire Bus Line
	7200 5450 10150 5450
Wire Bus Line
	7000 4650 10150 4650
Wire Bus Line
	6800 4000 10150 4000
Wire Bus Line
	6600 2900 10150 2900
Connection ~ 6200 2950
Wire Wire Line
	6200 3450 6200 3700
Connection ~ 6200 3450
Wire Wire Line
	700  2000 2100 2000
Connection ~ 2000 1800
Wire Wire Line
	2000 1800 2100 1800
Wire Wire Line
	3450 900  3450 1200
Connection ~ 6300 4050
Wire Wire Line
	6200 2950 6200 3200
Wire Wire Line
	5950 2950 6200 2950
Wire Wire Line
	5950 3200 6200 3200
Connection ~ 6200 3200
Wire Wire Line
	6200 3200 6200 3450
Wire Wire Line
	5950 3450 6200 3450
Wire Wire Line
	5950 3700 6200 3700
Wire Wire Line
	2000 1300 6200 1300
Wire Wire Line
	3450 2000 4250 2000
Wire Wire Line
	4150 2200 4150 1900
Connection ~ 4150 2200
Wire Wire Line
	4150 1900 4250 1900
Wire Wire Line
	5950 1900 6550 1900
Wire Wire Line
	5950 2000 6450 2000
$Comp
L power:Earth #PWR?
U 1 1 6104EF69
P 6450 2050
F 0 "#PWR?" H 6450 1800 50  0001 C CNN
F 1 "Earth" H 6450 1900 50  0001 C CNN
F 2 "" H 6450 2050 50  0001 C CNN
F 3 "~" H 6450 2050 50  0001 C CNN
	1    6450 2050
	1    0    0    -1  
$EndComp
Wire Wire Line
	6450 2000 6450 2050
Connection ~ 6450 2000
Wire Wire Line
	6450 2000 6550 2000
Wire Wire Line
	3300 1800 4150 1800
Wire Wire Line
	4150 1800 4150 1900
Connection ~ 3300 1800
Connection ~ 4150 1900
Wire Wire Line
	3300 900  3300 1800
Wire Wire Line
	4150 1800 4150 1400
Wire Wire Line
	4150 1400 6300 1400
Connection ~ 4150 1800
Wire Wire Line
	6300 1400 6300 1500
Wire Wire Line
	2000 1300 2000 1800
$Comp
L power:Earth #PWR?
U 1 1 6108BB50
P 3450 2200
F 0 "#PWR?" H 3450 1950 50  0001 C CNN
F 1 "Earth" H 3450 2050 50  0001 C CNN
F 2 "" H 3450 2200 50  0001 C CNN
F 3 "~" H 3450 2200 50  0001 C CNN
	1    3450 2200
	1    0    0    -1  
$EndComp
Wire Wire Line
	3450 2000 3450 2150
Wire Wire Line
	3450 2150 1600 2150
Wire Wire Line
	1600 2150 1600 2500
Connection ~ 3450 2150
Wire Wire Line
	3450 2150 3450 2200
Text GLabel 2000 950  1    50   Input ~ 0
PS_220
Wire Wire Line
	2000 1300 2000 950 
Connection ~ 2000 1300
Wire Wire Line
	6200 1300 6200 2950
Text GLabel 7300 1100 1    50   Input ~ 0
DEV_RS-485
Entry Wire Line
	8200 1350 8100 1250
Entry Wire Line
	8300 1350 8200 1250
$Comp
L plc:Arduino U2
U 1 1 613BD1BE
P 10000 1400
F 0 "U2" H 10278 1196 50  0000 L CNN
F 1 "Кондиционер_контроль" H 10278 1105 50  0000 L CNN
F 2 "" H 10000 1500 50  0001 C CNN
F 3 "" H 10000 1500 50  0001 C CNN
	1    10000 1400
	1    0    0    -1  
$EndComp
$Comp
L plc:Arduino U3
U 1 1 613C3104
P 10000 2100
F 0 "U3" H 10278 1896 50  0000 L CNN
F 1 "Бризер_контроль" H 10278 1805 50  0000 L CNN
F 2 "" H 10000 2200 50  0001 C CNN
F 3 "" H 10000 2200 50  0001 C CNN
	1    10000 2100
	1    0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x04_Female J?
U 1 1 613C85E1
P 8600 1600
F 0 "J?" H 8628 1530 50  0001 L CNN
F 1 "Conn_01x04_Female" H 8628 1485 50  0001 L CNN
F 2 "" H 8600 1600 50  0001 C CNN
F 3 "~" H 8600 1600 50  0001 C CNN
	1    8600 1600
	1    0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x04_Male JП1_1
U 1 1 613C8DA8
P 9250 1600
F 0 "JП1_1" H 8500 1800 50  0000 C CNN
F 1 "Кондиционер_контроль" H 9100 1800 50  0000 C CNN
F 2 "" H 9250 1600 50  0001 C CNN
F 3 "~" H 9250 1600 50  0001 C CNN
	1    9250 1600
	1    0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x04_Female J?
U 1 1 613CA068
P 8600 2300
F 0 "J?" H 8628 2230 50  0001 L CNN
F 1 "Conn_01x04_Female" H 8628 2185 50  0001 L CNN
F 2 "" H 8600 2300 50  0001 C CNN
F 3 "~" H 8600 2300 50  0001 C CNN
	1    8600 2300
	1    0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x04_Male JП1_2
U 1 1 613CA06E
P 9250 2300
F 0 "JП1_2" H 8500 2550 50  0000 C CNN
F 1 "Кондиционер_контроль" H 9100 2550 50  0000 C CNN
F 2 "" H 9250 2300 50  0001 C CNN
F 3 "~" H 9250 2300 50  0001 C CNN
	1    9250 2300
	1    0    0    -1  
$EndComp
Wire Wire Line
	9450 1500 9650 1500
Wire Wire Line
	9450 1600 9650 1600
Wire Wire Line
	9450 1700 9650 1700
Wire Wire Line
	9450 1800 9650 1800
Wire Wire Line
	9450 2200 9650 2200
Wire Wire Line
	9450 2300 9650 2300
Wire Wire Line
	9450 2400 9650 2400
Wire Wire Line
	9450 2500 9650 2500
Wire Wire Line
	8400 1800 8300 1800
Wire Wire Line
	8300 1800 8300 2500
Wire Wire Line
	8300 2500 8400 2500
Wire Wire Line
	8400 1700 8200 1700
Wire Wire Line
	8200 1700 8200 2400
Wire Wire Line
	8200 2400 8400 2400
Wire Wire Line
	8400 1600 8100 1600
Wire Wire Line
	8100 1600 8100 2300
Wire Wire Line
	8100 2300 8400 2300
Wire Wire Line
	8400 1500 8000 1500
Wire Wire Line
	8000 1500 8000 2200
Wire Wire Line
	8000 2200 8400 2200
Wire Wire Line
	5950 2400 8200 2400
Connection ~ 8200 2400
Wire Wire Line
	5950 2500 8300 2500
Connection ~ 8300 2500
Wire Wire Line
	8200 1350 8200 1700
Connection ~ 8200 1700
Wire Wire Line
	8300 1350 8300 1800
Connection ~ 8300 1800
Wire Bus Line
	7300 1250 7300 1100
Wire Wire Line
	8000 1500 6300 1500
Connection ~ 8000 1500
Connection ~ 6300 1500
Wire Wire Line
	6300 1500 6300 4050
Wire Wire Line
	3450 1200 7150 1200
Wire Wire Line
	7150 1200 7150 1600
Wire Wire Line
	7150 1600 8100 1600
Wire Bus Line
	1250 4700 3200 4700
Wire Bus Line
	3200 4500 3200 4700
Wire Bus Line
	1250 4500 3100 4500
Wire Bus Line
	1250 4100 3000 4100
Wire Bus Line
	1250 3200 2700 3200
Wire Bus Line
	1250 3000 2600 3000
Wire Bus Line
	1250 2800 2600 2800
Wire Bus Line
	1250 2600 2600 2600
Wire Bus Line
	7000 1100 7000 2200
Wire Bus Line
	6650 1100 6650 1900
Wire Bus Line
	7300 1250 8200 1250
Wire Bus Line
	3100 4100 3100 4500
Wire Bus Line
	7000 4650 7000 5250
Wire Bus Line
	7200 5450 7200 6250
Wire Bus Line
	6800 4000 6800 4600
Wire Bus Line
	6600 2900 6600 3800
Wire Bus Line
	3000 3100 3000 4100
Connection ~ 3450 1200
Wire Wire Line
	3450 1200 3450 2000
Connection ~ 8100 1600
$EndSCHEMATC
