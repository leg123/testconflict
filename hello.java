//仅用于测试验证冲突发生
using System;using System.Collections.G


eneric;using System.Text;using System.C

ollections;using System.Net;using System.IO;using System.Threading;using System.Diagnostics;namespace 
eLive.Common{ public cla
ss RequestState 
{ 

//存储请求状态 const int BUFFER_SIZE = 1024; public StringBuilder requestData; publ