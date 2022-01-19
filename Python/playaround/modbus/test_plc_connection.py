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
created: 2021-01-17
"""

import socket

from umodbus import conf
from umodbus.client import tcp




def main() -> None:

    conf.SIGNED_VALUES = True

    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    sock.connect(('10.0.6.10', 502))

    # message = tcp.read_holding_registers(slave_id=1, starting_address=0, quantity=1)
    message = tcp.write_single_register(slave_id=1, address=0, value=100)

    response = tcp.send_message(message, sock)

    sock.close()

    print(f"response = {response}")


if __name__ == '__main__':
    main()
