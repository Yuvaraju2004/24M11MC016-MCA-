/*console.log("sai")
function cube(x){
    return x*x*x
}
console.log(cube(5))
var x=require('os')
console.log(x.type())
console.log(x.version())
console.log(x.freemem())
console.log(x.hostname())
console.log(x.homedir())
var y=require('path')

console.log(y.dirname(__filename))
console.log(y.basename(__filename))
console.log(y.extname(__filename))
console.log(y.parse(__filename))*/
var x=require('http')
x.createServer((req,res)=>{
    res.write('welcome to node js')
    res.end()  
    console.log('server started')
}).listen(8085)
