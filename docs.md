# Protocol Documentation
<a name="top"/>

## Table of Contents
* [hello.proto](#hello.proto)
 * [ByeRequest](#com.example.protos.ByeRequest)
 * [ByeResponse](#com.example.protos.ByeResponse)
 * [HelloRequest](#com.example.protos.HelloRequest)
 * [HelloResponse](#com.example.protos.HelloResponse)
 * [Request](#com.example.protos.Request)
 * [Response](#com.example.protos.Response)
 * [Greeter](#com.example.protos.Greeter)
* [Scalar Value Types](#scalar-value-types)

<a name="hello.proto"/>
<p align="right"><a href="#top">Top</a></p>

## hello.proto

<a name="com.example.protos.ByeRequest"/>

### ByeRequest
Запрос прощания

| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) | required |  |


<a name="com.example.protos.ByeResponse"/>

### ByeResponse
Ответ сервера на прощание

| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message | [string](#string) | required |  |


<a name="com.example.protos.HelloRequest"/>

### HelloRequest
Запрос приветсвия

| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) | required |  |


<a name="com.example.protos.HelloResponse"/>

### HelloResponse
Ответ сервера на приветствие

| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message | [string](#string) | required |  |


<a name="com.example.protos.Request"/>

### Request
Базовый контейнер для запросов к серверу

| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) | required | Id Запроса |
| hello | [HelloRequest](#com.example.protos.HelloRequest) | optional |  |
| bye | [ByeRequest](#com.example.protos.ByeRequest) | optional |  |


<a name="com.example.protos.Response"/>

### Response
Базовый контейнер для ответов от сервера

| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) | required |  |
| hello | [HelloResponse](#com.example.protos.HelloResponse) | optional |  |
| bye | [ByeRequest](#com.example.protos.ByeRequest) | optional |  |


<a name="com.example.protos.Greeter"/>

### Greeter
Сервис Приветствия и прощания

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| SayHello | [Request](#com.example.protos.Request) | [Response](#com.example.protos.Response) | Обработать запрос |



<a name="scalar-value-types"/>

## Scalar Value Types

| .proto Type | Notes | C++ Type | Java Type | Python Type |
| ----------- | ----- | -------- | --------- | ----------- |
| <a name="double"/> double |  | double | double | float |
| <a name="float"/> float |  | float | float | float |
| <a name="int32"/> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int |
| <a name="int64"/> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long |
| <a name="uint32"/> uint32 | Uses variable-length encoding. | uint32 | int | int/long |
| <a name="uint64"/> uint64 | Uses variable-length encoding. | uint64 | long | int/long |
| <a name="sint32"/> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int |
| <a name="sint64"/> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long |
| <a name="fixed32"/> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int |
| <a name="fixed64"/> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long |
| <a name="sfixed32"/> sfixed32 | Always four bytes. | int32 | int | int |
| <a name="sfixed64"/> sfixed64 | Always eight bytes. | int64 | long | int/long |
| <a name="bool"/> bool |  | bool | boolean | boolean |
| <a name="string"/> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode |
| <a name="bytes"/> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str |
