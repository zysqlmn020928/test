<template>
  <div>
<h3>列表渲染</h3>
  <p v-for="item in names">{{item}}</p>
  </div>
</template>

<script>
export default {
 data(){
   return{
     names:["小明","小王","小张"]
   }
 }
}
</script>


