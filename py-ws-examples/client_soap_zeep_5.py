import zeep

if __name__ == '__main__':




    # make sure netbeans demo web service is running!
    wsdl = 'http://localhost:8080/CalcWS/CalWS?WSDL'
    client = zeep.Client(wsdl=wsdl)
    print(client.service.Addition('23', '20'))
