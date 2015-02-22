var express = require('express');
var app = express();

var bodyParser = require('body-parser');
app.use(bodyParser.json());

app.use(express.static(__dirname + '/../angular'));

app.get('/', function(req, res) {
    res.json({message: 'hi'});
});

app.get('/users', function(req, res) {
    res.json([
        {username: 'theneva'},
        {username: 'theknarf'},
        {username: 'j0nas'}
    ]);
});

app.listen(8081);
