import zeep

if __name__ == '__main__':



    # web service endpoint
    wsdl = 'http://vhost3.cs.rit.edu/SortServ/Service.svc?singleWsdl'

    # initializing the client to consume the web service
    client = zeep.Client(wsdl=wsdl)

    # we need a key to authenticate with the web service, which in this case can be retrieved by a remote function
    key = client.service.GetKey()
    print(f'Our authentication key is {key}')

    # now let's use a remote function to sort a list of numbers
    # the input format is a string with numbers separated by space
    unsorted = '03 05 10 20 01'
    print(f'mergeSort(unsorted) = {client.service.mergeSort(unsorted, key)}')
    print(f'selectionSort(unsorted) = {client.service.selectionSort(unsorted, key)}')

