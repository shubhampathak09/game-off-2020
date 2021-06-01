var game=new Phaser.Game(800,600,Phaser.CANVAS,'gameDiv'); // instance

console.log(game);


var mainState={
    preload:function()
    {

    },
    create:function()
    {

    },
    update:function()
    {

    } 
}


game.scenes.add('mainstate',mainState);

game.scenes._start('mainstate');  // phaser 3 uses now scene instead of start


