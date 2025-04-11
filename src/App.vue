<template>
  <div :id="dynamicId" :class="dynamicClass">测试
    <p>{{msg}}</p>
    <p v-html="rawhtml"></p>
    <button :disabled="isButtonDisabled">button</button>
    <test />
    <render />
  </div>

</template>

<script>
import Test from "./components/test";
import Render from "./components/render";
export default {
  components: {Render, Test},
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
