
<template>
  <div :id="dynamicId" :class="dynamicClass">分包思想
    <h3>新手勇闯vue</h3>
  </div>
</template>

<script>

export default {
  data(){
    return{
      msg:"vue新手教程",
      number:10,
      rawhtml:"<a href='https://baidu.com'>百度官网</a>",
      dynamicClass:"appclass",
      dynamicId:"appid",
      isButtonDisabled:false,
    }
  }
}
</script>
<style>
.appclass{
  color: blue;
  font-size: 100px;
}
</style>
