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
created: 2021-01-10
"""

from time import sleep
import minimalmodbus


def main() -> None:

    instrument = minimalmodbus.Instrument('COM5', slaveaddress=1, mode=minimalmodbus.MODE_RTU)
    instrument.serial.baudrate = 115200

    instrument.write_register(registeraddress=0, value=1000)
    sleep(.5)

    r = instrument.read_register(registeraddress=0)
    print(r)

    # instrument.write_register(registeraddress=1, value=100, number_of_decimals=1)
    # sleep(.5)
    # instrument.write_register(registeraddress=2, value=100, number_of_decimals=1)
    # sleep(.5)
    # instrument.write_register(registeraddress=3, value=100, number_of_decimals=1)
    # sleep(.5)
    # instrument.write_register(registeraddress=4, value=100, number_of_decimals=1)
    # sleep(.5)
    # instrument.write_register(registeraddress=5, value=100, number_of_decimals=1)
    # sleep(.5)
    # instrument.write_register(registeraddress=6, value=100, number_of_decimals=1)
    # sleep(.5)
    # instrument.write_register(registeraddress=7, value=100, number_of_decimals=1)
    # sleep(.5)


if __name__ == '__main__':
    main()
