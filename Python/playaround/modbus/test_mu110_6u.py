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
    instrument = minimalmodbus.Instrument('COM5', slaveaddress=4, mode=minimalmodbus.MODE_RTU)
    instrument.serial.baudrate = 115200

    for i in range(0, 101):
        instrument.write_register(registeraddress=0, value=(i * 10))

        r = instrument.read_register(registeraddress=0)

        print(r)

        sleep(.5)


if __name__ == '__main__':
    main()
