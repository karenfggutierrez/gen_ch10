console.log("Starting my script");
function myFunction(){
    document.getElementById("demo").style.color= "purple"
}
setTimeout(function(){
    document.getElementById("demo").innerHTML = "The tytle was modified";
}, 4000);
function myFunction2(element,color){
    element.style.color =color;
    console.log("Changing colors")
}
function myFunction3(){
    const collection= document.getElementsByClassName ("color");
    for(let i=0;i<collection.length;i ++){
        collection[i].style.color= "blue";
    }
}
function myFunction4(){
    const collection=document.getElementsByClassName ("color");
    for(let i=0;i<collection.length;i ++){
        collection[i].style.backgroundColor= "beige";
    }

}
function myFunction5(){
    document.body.style.backgroundColor= "beige";
}