 
listView('MailAfter1234 Jobs') {
    description('MailAfter1234 Jobs')
    jobs {
        regex('MailAfter1234_.+')
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
