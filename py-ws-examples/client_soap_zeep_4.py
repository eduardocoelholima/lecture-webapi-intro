import zeep

if __name__ == '__main__':




    # testing a local web service built with spyne
    wsdl = 'http://localhost:8000/say_hello/service.wsdl'
    client = zeep.Client(wsdl=wsdl)
    print(client.service.say_hello('World', '4'))
    # print(client.service.say_hi())
    # print(client.service.sortNumbers('01 10 08 23 00'))
