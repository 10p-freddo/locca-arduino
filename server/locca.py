#!/opt/bin/python2.6

PORT = 5525

import BaseHTTPServer, SocketServer

class LoccaHTTPRequestHandler(BaseHTTPServer.BaseHTTPRequestHandler):
    server_version = "LoccaServer/1.0"
    def do_GET(self):
        if self.path.startswith("/trigger"):
            serial.write('A')
            self.send_response(200)
        else:
            self.send_error(404)

serial = open("/dev/ttyACM0", 'wb', 0)

httpd = SocketServer.TCPServer(("", PORT), LoccaHTTPRequestHandler, False)
httpd.allow_reuse_address = True
httpd.server_bind()
httpd.server_activate()
httpd.serve_forever()
