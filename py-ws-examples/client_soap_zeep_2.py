import zeep

if __name__ == '__main__':



    IP Geolocation web service
    wsdl = 'http://ws.cdyne.com/ip2geo/ip2geo.asmx?wsdl'
    client = zeep.Client(wsdl=wsdl)
    print(client.service.ResolveIP('20.20.20.20', '0'))

