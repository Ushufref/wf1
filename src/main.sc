requre: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    stae: Start
        q!: $regex</start>
        a: start

    state: /hello
        q!: [* *ello */* hi */ *ood (morning/afternoon/evening)/* Hi
        a: sap
        
    state: /weather
        q!: * *eather *
        a: sd
    
    stae: /currency
        q!: * *urrency *
        a: 1 EUR = 73.28 RUB
        
    state: /NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}