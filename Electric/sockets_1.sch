EESchema Schematic File Version 4
EELAYER 30 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 1 1
Title "Розетки, лист 1"
Date "2021-06-16"
Rev "1"
Comp ""
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
$Comp
L Connector:Conn_01x03_Female JР1_1
U 1 1 60CC8FCC
P 1650 1950
F 0 "JР1_1" H 1700 2050 50  0000 L CNN
F 1 "Розетка, комната на стене" H 1678 1930 50  0000 L CNN
F 2 "" H 1650 1950 50  0001 C CNN
F 3 "~" H 1650 1950 50  0001 C CNN
	1    1650 1950
	-1   0    0    -1  
$EndComp
Text GLabel 2050 900  1    50   Input ~ 0
PE
Text GLabel 2300 900  1    50   Input ~ 0
N1
Text GLabel 6050 900  1    50   Input ~ 0
F3
Text GLabel 5900 900  1    50   Input ~ 0
F2
Text GLabel 5750 900  1    50   Input ~ 0
F1
$Comp
L Connector:Conn_01x03_Female JР1_2
U 1 1 60FB09B1
P 1650 2300
F 0 "JР1_2" H 1700 2400 50  0000 L CNN
F 1 "Розетка, комната у полочки" H 1678 2280 50  0000 L CNN
F 2 "" H 1650 2300 50  0001 C CNN
F 3 "~" H 1650 2300 50  0001 C CNN
	1    1650 2300
	-1   0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x03_Female JР1_3
U 1 1 60FB0E4A
P 1650 2800
F 0 "JР1_3" H 1700 2900 50  0000 L CNN
F 1 "Розетка, лоджия" H 1678 2780 50  0000 L CNN
F 2 "" H 1650 2800 50  0001 C CNN
F 3 "~" H 1650 2800 50  0001 C CNN
	1    1650 2800
	-1   0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x03_Female JР1_4
U 1 1 60FB132C
P 1650 3150
F 0 "JР1_4" H 1700 3250 50  0000 L CNN
F 1 "Розетка, кухня по центру" H 1678 3130 50  0000 L CNN
F 2 "" H 1650 3150 50  0001 C CNN
F 3 "~" H 1650 3150 50  0001 C CNN
	1    1650 3150
	-1   0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x03_Female JР1_5
U 1 1 60FB176D
P 1650 3500
F 0 "JР1_5" H 1700 3600 50  0000 L CNN
F 1 "Розетка, коридор" H 1678 3480 50  0000 L CNN
F 2 "" H 1650 3500 50  0001 C CNN
F 3 "~" H 1650 3500 50  0001 C CNN
	1    1650 3500
	-1   0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x03_Female JР1_6
U 1 1 60FB2AB8
P 1650 3850
F 0 "JР1_6" H 1700 3950 50  0000 L CNN
F 1 "Розетка, ванна" H 1678 3830 50  0000 L CNN
F 2 "" H 1650 3850 50  0001 C CNN
F 3 "~" H 1650 3850 50  0001 C CNN
	1    1650 3850
	-1   0    0    -1  
$EndComp
Wire Wire Line
	1850 3250 2050 3250
Wire Wire Line
	1850 2900 2050 2900
Connection ~ 2050 2900
Wire Wire Line
	2050 2900 2050 3250
Wire Wire Line
	1850 2400 2050 2400
Wire Wire Line
	1850 2050 2050 2050
Connection ~ 2050 2050
Wire Wire Line
	2050 2050 2050 2400
Wire Wire Line
	1850 2300 2300 2300
Wire Wire Line
	1850 1950 2300 1950
Connection ~ 2300 1950
Wire Wire Line
	2300 1950 2300 2300
Wire Wire Line
	3550 1850 3550 2200
Wire Wire Line
	3550 2700 3550 3050
$Comp
L Relay:SILxx-1Axx-71x РК1_1
U 1 1 60FE4493
P 4150 2050
F 0 "РК1_1" V 4500 2050 50  0000 C CNN
F 1 "SILxx-1Axx-71x" V 4550 2150 50  0001 C CNN
F 2 "Relay_THT:Relay_SPST_StandexMeder_SIL_Form1A" H 4500 2000 50  0001 L CNN
F 3 "https://standexelectronics.com/wp-content/uploads/datasheet_reed_relay_SIL.pdf" H 4150 2050 50  0001 C CNN
	1    4150 2050
	0    -1   -1   0   
$EndComp
$Comp
L Relay:SILxx-1Axx-71x РК1_2
U 1 1 60FE66D3
P 4150 2900
F 0 "РК1_2" V 4500 2900 50  0000 C CNN
F 1 "SILxx-1Axx-71x" V 4550 3000 50  0001 C CNN
F 2 "Relay_THT:Relay_SPST_StandexMeder_SIL_Form1A" H 4500 2850 50  0001 L CNN
F 3 "https://standexelectronics.com/wp-content/uploads/datasheet_reed_relay_SIL.pdf" H 4150 2900 50  0001 C CNN
	1    4150 2900
	0    -1   -1   0   
$EndComp
$Comp
L Relay:SILxx-1Axx-71x РК1_3
U 1 1 60FE7884
P 4150 3750
F 0 "РК1_3" V 4500 3750 50  0000 C CNN
F 1 "SILxx-1Axx-71x" V 4550 3850 50  0001 C CNN
F 2 "Relay_THT:Relay_SPST_StandexMeder_SIL_Form1A" H 4500 3700 50  0001 L CNN
F 3 "https://standexelectronics.com/wp-content/uploads/datasheet_reed_relay_SIL.pdf" H 4150 3750 50  0001 C CNN
	1    4150 3750
	0    -1   -1   0   
$EndComp
Wire Wire Line
	2050 2400 2050 2900
Connection ~ 2050 2400
Connection ~ 2050 3250
Wire Wire Line
	3550 1850 3850 1850
Connection ~ 3550 1850
Wire Wire Line
	3550 2700 3850 2700
Connection ~ 3550 2700
$Comp
L Device:CircuitBreaker_1P CBР1_6
U 1 1 60FFF5E2
P 5100 1850
F 0 "CBР1_6" V 4950 1750 50  0000 C CNN
F 1 "16А" V 4950 2100 50  0000 C CNN
F 2 "" H 5100 1850 50  0001 C CNN
F 3 "~" H 5100 1850 50  0001 C CNN
	1    5100 1850
	0    1    1    0   
$EndComp
$Comp
L Device:CircuitBreaker_1P CBР1_7
U 1 1 610012AD
P 5100 2700
F 0 "CBР1_7" V 4950 2600 50  0000 C CNN
F 1 "16А" V 4950 2950 50  0000 C CNN
F 2 "" H 5100 2700 50  0001 C CNN
F 3 "~" H 5100 2700 50  0001 C CNN
	1    5100 2700
	0    1    1    0   
$EndComp
Wire Wire Line
	3850 2250 3750 2250
Wire Wire Line
	3750 2250 3750 3100
Wire Wire Line
	3750 3100 3850 3100
Wire Wire Line
	3750 3100 3750 3950
Wire Wire Line
	3750 3950 3850 3950
Connection ~ 3750 3100
Entry Wire Line
	5500 2250 5600 2350
Entry Wire Line
	5500 3100 5600 3200
Entry Wire Line
	5500 3950 5600 4050
Wire Wire Line
	4450 2250 5500 2250
Wire Wire Line
	4450 3100 5500 3100
Wire Wire Line
	4450 3950 5500 3950
Text GLabel 5600 7050 3    50   Input ~ 0
Р1_C
Text GLabel 2450 900  1    50   Input ~ 0
N2
Text GLabel 2600 900  1    50   Input ~ 0
N3
Wire Wire Line
	1850 2800 2450 2800
Wire Wire Line
	2450 2800 2450 3150
Wire Wire Line
	1850 3150 2450 3150
Connection ~ 2450 2800
Text GLabel 3750 7050 3    50   Input ~ 0
C_N1
Connection ~ 3750 3950
$Comp
L sockets_1-rescue:УЗО-plc U1
U 1 1 610616AB
P 5050 3450
F 0 "U1" H 5050 3575 50  0000 C CNN
F 1 "УЗО_АВТ_16А" H 5050 3484 50  0000 C CNN
F 2 "" H 5050 3450 50  0001 C CNN
F 3 "" H 5050 3450 50  0001 C CNN
	1    5050 3450
	-1   0    0    -1  
$EndComp
Wire Wire Line
	5750 1850 5400 1850
Wire Wire Line
	5400 2700 5900 2700
Wire Wire Line
	2050 900  2050 2050
Wire Wire Line
	2300 900  2300 1950
Wire Wire Line
	2450 900  2450 2800
Wire Wire Line
	4450 1850 4800 1850
Wire Wire Line
	4450 2700 4800 2700
Wire Wire Line
	5750 900  5750 1850
Wire Wire Line
	5900 900  5900 2700
Wire Wire Line
	6050 900  6050 3550
Wire Wire Line
	3750 3950 3750 4950
$Comp
L Connector:Conn_01x03_Female JР1_8
U 1 1 60E12DB8
P 1650 4650
F 0 "JР1_8" H 1700 4750 50  0000 L CNN
F 1 "Плита, микроволновка" H 1678 4630 50  0000 L CNN
F 2 "" H 1650 4650 50  0001 C CNN
F 3 "~" H 1650 4650 50  0001 C CNN
	1    1650 4650
	-1   0    0    -1  
$EndComp
$Comp
L Connector:Conn_01x03_Female JР1_9
U 1 1 60E12DBE
P 1650 5500
F 0 "JР1_9" H 1700 5600 50  0000 L CNN
F 1 "Холодильник мойка" H 1678 5480 50  0000 L CNN
F 2 "" H 1650 5500 50  0001 C CNN
F 3 "~" H 1650 5500 50  0001 C CNN
	1    1650 5500
	-1   0    0    -1  
$EndComp
Wire Wire Line
	1850 5600 2050 5600
Wire Wire Line
	1850 4750 2050 4750
$Comp
L Relay:SILxx-1Axx-71x РК1_?
U 1 1 60E15F90
P 4150 4750
F 0 "РК1_?" V 4500 4750 50  0000 C CNN
F 1 "SILxx-1Axx-71x" V 4550 4850 50  0001 C CNN
F 2 "Relay_THT:Relay_SPST_StandexMeder_SIL_Form1A" H 4500 4700 50  0001 L CNN
F 3 "https://standexelectronics.com/wp-content/uploads/datasheet_reed_relay_SIL.pdf" H 4150 4750 50  0001 C CNN
	1    4150 4750
	0    -1   -1   0   
$EndComp
$Comp
L Device:CircuitBreaker_1P CBР1_9
U 1 1 60E15F97
P 5100 4550
F 0 "CBР1_9" V 4950 4450 50  0000 C CNN
F 1 "25А" V 4950 4800 50  0000 C CNN
F 2 "" H 5100 4550 50  0001 C CNN
F 3 "~" H 5100 4550 50  0001 C CNN
	1    5100 4550
	0    1    1    0   
$EndComp
Entry Wire Line
	5500 4950 5600 5050
Wire Wire Line
	4450 4950 5500 4950
Wire Wire Line
	4450 4550 4800 4550
$Comp
L Relay:SILxx-1Axx-71x РК1_?
U 1 1 60E189FF
P 4150 5600
F 0 "РК1_?" V 4500 5600 50  0000 C CNN
F 1 "SILxx-1Axx-71x" V 4550 5700 50  0001 C CNN
F 2 "Relay_THT:Relay_SPST_StandexMeder_SIL_Form1A" H 4500 5550 50  0001 L CNN
F 3 "https://standexelectronics.com/wp-content/uploads/datasheet_reed_relay_SIL.pdf" H 4150 5600 50  0001 C CNN
	1    4150 5600
	0    -1   -1   0   
$EndComp
$Comp
L Device:CircuitBreaker_1P CBР1_10
U 1 1 60E18A06
P 5100 5400
F 0 "CBР1_10" V 4950 5300 50  0000 C CNN
F 1 "16А" V 4950 5650 50  0000 C CNN
F 2 "" H 5100 5400 50  0001 C CNN
F 3 "~" H 5100 5400 50  0001 C CNN
	1    5100 5400
	0    1    1    0   
$EndComp
Entry Wire Line
	5500 5800 5600 5900
Wire Wire Line
	4450 5800 5500 5800
Wire Wire Line
	4450 5400 4800 5400
Wire Wire Line
	5900 2700 5900 4550
Wire Wire Line
	5900 4550 5400 4550
Connection ~ 5900 2700
Wire Wire Line
	5900 4550 5900 5400
Wire Wire Line
	5900 5400 5400 5400
Connection ~ 5900 4550
Wire Wire Line
	3850 4950 3750 4950
Connection ~ 3750 4950
Wire Wire Line
	3750 4950 3750 5800
Wire Wire Line
	3850 5800 3750 5800
Connection ~ 3750 5800
Wire Wire Line
	3750 5800 3750 7050
Wire Wire Line
	1850 4550 3850 4550
Wire Wire Line
	1850 5400 3850 5400
Wire Wire Line
	2050 4750 2050 5600
Connection ~ 2050 4750
Wire Wire Line
	2450 3150 2450 4650
Wire Wire Line
	1850 4650 2450 4650
Connection ~ 2450 3150
Wire Wire Line
	2450 4650 2450 5500
Wire Wire Line
	1850 5500 2450 5500
Connection ~ 2450 4650
Wire Wire Line
	1850 1850 3550 1850
Wire Wire Line
	1850 2200 3550 2200
Wire Wire Line
	1850 2700 3550 2700
Wire Wire Line
	1850 3050 3550 3050
Wire Wire Line
	5400 3550 6050 3550
Wire Wire Line
	4450 3550 4700 3550
Wire Wire Line
	2600 4300 5400 4300
Wire Wire Line
	5400 3650 5400 4300
Wire Wire Line
	2600 900  2600 4300
Wire Wire Line
	4700 4200 4700 3650
$Comp
L Connector:Conn_01x03_Female JР1_7
U 1 1 61393F01
P 1650 4200
F 0 "JР1_7" H 1700 4300 50  0000 L CNN
F 1 "Полочка, ванна" H 1678 4180 50  0000 L CNN
F 2 "" H 1650 4200 50  0001 C CNN
F 3 "~" H 1650 4200 50  0001 C CNN
	1    1650 4200
	-1   0    0    -1  
$EndComp
Wire Wire Line
	3550 3550 3850 3550
Wire Wire Line
	2050 3250 2050 3600
Wire Wire Line
	1850 4300 2050 4300
Connection ~ 2050 4300
Wire Wire Line
	2050 4300 2050 4750
Wire Wire Line
	1850 3950 2050 3950
Connection ~ 2050 3950
Wire Wire Line
	2050 3950 2050 4300
Wire Wire Line
	1850 3600 2050 3600
Connection ~ 2050 3600
Wire Wire Line
	2050 3600 2050 3950
Wire Wire Line
	2200 4200 2200 3850
Wire Wire Line
	2200 3850 1850 3850
Wire Wire Line
	1850 4200 2200 4200
Wire Wire Line
	2200 3850 2200 3500
Wire Wire Line
	2200 3500 1850 3500
Connection ~ 2200 3850
Wire Wire Line
	2200 4200 4700 4200
Connection ~ 2200 4200
Wire Wire Line
	1850 3400 2300 3400
Wire Wire Line
	3550 3400 3550 3550
Wire Wire Line
	1850 3750 2300 3750
Wire Wire Line
	2300 3750 2300 3400
Connection ~ 2300 3400
Wire Wire Line
	2300 3400 3550 3400
$Comp
L Device:CircuitBreaker_1P CBР1_?
U 1 1 613B29CB
P 3050 4100
F 0 "CBР1_?" V 2900 4000 50  0000 C CNN
F 1 "6А" V 2900 4350 50  0000 C CNN
F 2 "" H 3050 4100 50  0001 C CNN
F 3 "~" H 3050 4100 50  0001 C CNN
	1    3050 4100
	0    1    1    0   
$EndComp
Wire Wire Line
	3550 3550 3550 4100
Wire Wire Line
	3550 4100 3350 4100
Connection ~ 3550 3550
Wire Wire Line
	1850 4100 2750 4100
Wire Bus Line
	5600 2350 5600 7050
$EndSCHEMATC
