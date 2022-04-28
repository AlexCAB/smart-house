#!/usr/bin/python
# -*- coding: utf-8 -*-

r"""
  o-o                 o      o  o
  |                    |      |  |
  o-o  o-O-o  oo o-o -o-     O--O o-o o  o o-o
     | | | | | | |    |      |  | | | |  |  \
 o--o  o o o o-o-o    o      o  o o-o o--o o-o

author: CAB
website: github.com/alexcab
created: 2021-01-11
"""

import struct
from time import sleep
import minimalmodbus


def main() -> None:

    instrument = minimalmodbus.Instrument('COM4', slaveaddress=3, mode=minimalmodbus.MODE_RTU)
    instrument.serial.baudrate = 115200

    for i in range(0, 1000):
        print(f"### i = {i}")

        try:

            r0 = instrument.read_register(registeraddress=42, number_of_decimals=0)
            r1 = instrument.read_register(registeraddress=43, number_of_decimals=0)
            r2 = instrument.read_register(registeraddress=44, number_of_decimals=0)
            r3 = instrument.read_register(registeraddress=45, number_of_decimals=0)
            r4 = instrument.read_register(registeraddress=46, number_of_decimals=0)
            r5 = instrument.read_register(registeraddress=47, number_of_decimals=0)

            print(f"r0 = {r0}")       # Положение десятичной точки в целом значении для входа 1
            print(f"r1 = {r1}")       # Целое значение измерение входа 1 со смещением точки
            print(f"r2 = {hex(r2)}")  # Статус измерения входа
            print(f"r3 = {r3}")       # Циклическое время измерения входа
            print(f"r4 = {hex(r4)}")  # Измерение входа 1 в представлении с плавающей точкой
            print(f"r5 = {hex(r5)}")  #

            t = struct.unpack('f', ((r4 << 16) | r5).to_bytes(4, byteorder='little'))[0]

            print(f"t = {t}")
        except minimalmodbus.NoResponseError as err:
            print(f"err = {err}")

        sleep(0.5)


if __name__ == '__main__':
    main()
