 
listView('KamelKejsik Jobs') {
    description('KamelKejsik Jobs')
    jobs {
        regex('KamelKejsik_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
