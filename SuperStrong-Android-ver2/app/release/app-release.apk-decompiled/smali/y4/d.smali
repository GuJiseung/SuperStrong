.class public final Ly4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly4/i;

.field public final b:Lv4/a;

.field public final c:Ly4/f;

.field public final d:Lv4/m;

.field public e:Ly4/h$a;

.field public final f:Ly4/h;

.field public g:Ly4/e;

.field public h:Z

.field public i:Lv4/e0;


# direct methods
.method public constructor <init>(Ly4/i;Ly4/f;Lv4/a;Lv4/d;Lv4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/d;->a:Ly4/i;

    iput-object p2, p0, Ly4/d;->c:Ly4/f;

    iput-object p3, p0, Ly4/d;->b:Lv4/a;

    iput-object p5, p0, Ly4/d;->d:Lv4/m;

    new-instance p1, Ly4/h;

    iget-object p2, p2, Ly4/f;->e:Lq3/b;

    invoke-direct {p1, p3, p2, p4, p5}, Ly4/h;-><init>(Lv4/a;Lq3/b;Lv4/d;Lv4/m;)V

    iput-object p1, p0, Ly4/d;->f:Ly4/h;

    return-void
.end method


# virtual methods
.method public final a(ZIII)Ly4/e;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Ly4/d;->c:Ly4/f;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-object v0, v1, Ly4/d;->a:Ly4/i;

    .line 7
    .line 8
    iget-object v3, v0, Ly4/i;->b:Ly4/f;

    .line 9
    .line 10
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 11
    :try_start_1
    iget-boolean v0, v0, Ly4/i;->m:Z

    .line 12
    .line 13
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 14
    if-nez v0, :cond_2b

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :try_start_2
    iput-boolean v0, v1, Ly4/d;->h:Z

    .line 18
    .line 19
    iget-object v3, v1, Ly4/d;->a:Ly4/i;

    .line 20
    .line 21
    iget-object v4, v3, Ly4/i;->i:Ly4/e;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-boolean v6, v4, Ly4/e;->k:Z

    .line 27
    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Ly4/i;->f()Ljava/net/Socket;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v3, v5

    .line 36
    :goto_0
    iget-object v6, v1, Ly4/d;->a:Ly4/i;

    .line 37
    .line 38
    iget-object v7, v6, Ly4/i;->i:Ly4/e;

    .line 39
    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    move-object v4, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v7, v5

    .line 45
    :goto_1
    const/4 v8, 0x1

    .line 46
    if-nez v7, :cond_4

    .line 47
    .line 48
    iget-object v9, v1, Ly4/d;->c:Ly4/f;

    .line 49
    .line 50
    iget-object v10, v1, Ly4/d;->b:Lv4/a;

    .line 51
    .line 52
    invoke-virtual {v9, v10, v6, v5, v0}, Ly4/f;->c(Lv4/a;Ly4/i;Ljava/util/ArrayList;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    iget-object v6, v1, Ly4/d;->a:Ly4/i;

    .line 59
    .line 60
    iget-object v7, v6, Ly4/i;->i:Ly4/e;

    .line 61
    .line 62
    move-object v6, v5

    .line 63
    move v9, v8

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    iget-object v6, v1, Ly4/d;->i:Lv4/e0;

    .line 66
    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    iput-object v5, v1, Ly4/d;->i:Lv4/e0;

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ly4/d;->d()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    iget-object v6, v1, Ly4/d;->a:Ly4/i;

    .line 79
    .line 80
    iget-object v6, v6, Ly4/i;->i:Ly4/e;

    .line 81
    .line 82
    iget-object v6, v6, Ly4/e;->c:Lv4/e0;

    .line 83
    .line 84
    :goto_2
    move v9, v0

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move v9, v0

    .line 87
    move-object v6, v5

    .line 88
    :goto_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 89
    invoke-static {v3}, Lw4/e;->c(Ljava/net/Socket;)V

    .line 90
    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    iget-object v2, v1, Ly4/d;->d:Lv4/m;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    :cond_5
    if-eqz v9, :cond_6

    .line 100
    .line 101
    iget-object v2, v1, Ly4/d;->d:Lv4/m;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    :cond_6
    if-eqz v7, :cond_7

    .line 107
    .line 108
    return-object v7

    .line 109
    :cond_7
    if-nez v6, :cond_1f

    .line 110
    .line 111
    iget-object v2, v1, Ly4/d;->e:Ly4/h$a;

    .line 112
    .line 113
    if-eqz v2, :cond_9

    .line 114
    .line 115
    iget v3, v2, Ly4/h$a;->b:I

    .line 116
    .line 117
    iget-object v2, v2, Ly4/h$a;->a:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-ge v3, v2, :cond_8

    .line 124
    .line 125
    move v2, v8

    .line 126
    goto :goto_4

    .line 127
    :cond_8
    move v2, v0

    .line 128
    :goto_4
    if-nez v2, :cond_1f

    .line 129
    .line 130
    :cond_9
    iget-object v2, v1, Ly4/d;->f:Ly4/h;

    .line 131
    .line 132
    iget v3, v2, Ly4/h;->e:I

    .line 133
    .line 134
    iget-object v4, v2, Ly4/h;->d:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-ge v3, v4, :cond_a

    .line 141
    .line 142
    move v3, v8

    .line 143
    goto :goto_5

    .line 144
    :cond_a
    move v3, v0

    .line 145
    :goto_5
    if-nez v3, :cond_c

    .line 146
    .line 147
    iget-object v3, v2, Ly4/h;->g:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_b

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_b
    move v3, v0

    .line 157
    goto :goto_7

    .line 158
    :cond_c
    :goto_6
    move v3, v8

    .line 159
    :goto_7
    if-eqz v3, :cond_1e

    .line 160
    .line 161
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    :goto_8
    iget v4, v2, Ly4/h;->e:I

    .line 167
    .line 168
    iget-object v10, v2, Ly4/h;->d:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-ge v4, v10, :cond_d

    .line 175
    .line 176
    move v4, v8

    .line 177
    goto :goto_9

    .line 178
    :cond_d
    move v4, v0

    .line 179
    :goto_9
    if-eqz v4, :cond_1c

    .line 180
    .line 181
    iget v4, v2, Ly4/h;->e:I

    .line 182
    .line 183
    iget-object v10, v2, Ly4/h;->d:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-ge v4, v10, :cond_e

    .line 190
    .line 191
    move v4, v8

    .line 192
    goto :goto_a

    .line 193
    :cond_e
    move v4, v0

    .line 194
    :goto_a
    const-string v10, "No route to "

    .line 195
    .line 196
    iget-object v11, v2, Ly4/h;->a:Lv4/a;

    .line 197
    .line 198
    if-eqz v4, :cond_1b

    .line 199
    .line 200
    iget-object v4, v2, Ly4/h;->d:Ljava/util/List;

    .line 201
    .line 202
    iget v12, v2, Ly4/h;->e:I

    .line 203
    .line 204
    add-int/lit8 v13, v12, 0x1

    .line 205
    .line 206
    iput v13, v2, Ly4/h;->e:I

    .line 207
    .line 208
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, Ljava/net/Proxy;

    .line 213
    .line 214
    new-instance v12, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    iput-object v12, v2, Ly4/h;->f:Ljava/util/List;

    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    sget-object v13, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 226
    .line 227
    if-eq v12, v13, :cond_12

    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    sget-object v13, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 234
    .line 235
    if-ne v12, v13, :cond_f

    .line 236
    .line 237
    goto :goto_c

    .line 238
    :cond_f
    invoke-virtual {v4}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    instance-of v13, v12, Ljava/net/InetSocketAddress;

    .line 243
    .line 244
    if-eqz v13, :cond_11

    .line 245
    .line 246
    check-cast v12, Ljava/net/InetSocketAddress;

    .line 247
    .line 248
    invoke-virtual {v12}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    if-nez v13, :cond_10

    .line 253
    .line 254
    invoke-virtual {v12}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v13

    .line 258
    goto :goto_b

    .line 259
    :cond_10
    invoke-virtual {v13}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v13

    .line 263
    :goto_b
    invoke-virtual {v12}, Ljava/net/InetSocketAddress;->getPort()I

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    goto :goto_d

    .line 268
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 269
    .line 270
    new-instance v2, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v3, "Proxy.address() is not an InetSocketAddress: "

    .line 273
    .line 274
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v0

    .line 292
    :cond_12
    :goto_c
    iget-object v12, v11, Lv4/a;->a:Lv4/q;

    .line 293
    .line 294
    iget-object v13, v12, Lv4/q;->d:Ljava/lang/String;

    .line 295
    .line 296
    iget v12, v12, Lv4/q;->e:I

    .line 297
    .line 298
    :goto_d
    if-lt v12, v8, :cond_1a

    .line 299
    .line 300
    const v14, 0xffff

    .line 301
    .line 302
    .line 303
    if-gt v12, v14, :cond_1a

    .line 304
    .line 305
    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 306
    .line 307
    .line 308
    move-result-object v10

    .line 309
    sget-object v14, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 310
    .line 311
    if-ne v10, v14, :cond_13

    .line 312
    .line 313
    iget-object v10, v2, Ly4/h;->f:Ljava/util/List;

    .line 314
    .line 315
    invoke-static {v13, v12}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_f

    .line 323
    :cond_13
    iget-object v10, v2, Ly4/h;->c:Lv4/m;

    .line 324
    .line 325
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    iget-object v10, v11, Lv4/a;->b:Lv4/l;

    .line 329
    .line 330
    check-cast v10, La2/d;

    .line 331
    .line 332
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    if-eqz v13, :cond_19

    .line 336
    .line 337
    :try_start_3
    invoke-static {v13}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v10
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0

    .line 345
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v14

    .line 349
    if-nez v14, :cond_18

    .line 350
    .line 351
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    move v13, v0

    .line 356
    :goto_e
    if-ge v13, v11, :cond_14

    .line 357
    .line 358
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    check-cast v14, Ljava/net/InetAddress;

    .line 363
    .line 364
    iget-object v15, v2, Ly4/h;->f:Ljava/util/List;

    .line 365
    .line 366
    new-instance v8, Ljava/net/InetSocketAddress;

    .line 367
    .line 368
    invoke-direct {v8, v14, v12}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v15, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    add-int/lit8 v13, v13, 0x1

    .line 375
    .line 376
    const/4 v8, 0x1

    .line 377
    goto :goto_e

    .line 378
    :cond_14
    :goto_f
    iget-object v8, v2, Ly4/h;->f:Ljava/util/List;

    .line 379
    .line 380
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    move v10, v0

    .line 385
    :goto_10
    if-ge v10, v8, :cond_16

    .line 386
    .line 387
    new-instance v11, Lv4/e0;

    .line 388
    .line 389
    iget-object v12, v2, Ly4/h;->a:Lv4/a;

    .line 390
    .line 391
    iget-object v13, v2, Ly4/h;->f:Ljava/util/List;

    .line 392
    .line 393
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v13

    .line 397
    check-cast v13, Ljava/net/InetSocketAddress;

    .line 398
    .line 399
    invoke-direct {v11, v12, v4, v13}, Lv4/e0;-><init>(Lv4/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 400
    .line 401
    .line 402
    iget-object v12, v2, Ly4/h;->b:Lq3/b;

    .line 403
    .line 404
    monitor-enter v12

    .line 405
    :try_start_4
    iget-object v13, v12, Lq3/b;->a:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v13, Ljava/util/Set;

    .line 408
    .line 409
    invoke-interface {v13, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 413
    monitor-exit v12

    .line 414
    if-eqz v13, :cond_15

    .line 415
    .line 416
    iget-object v12, v2, Ly4/h;->g:Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_11

    .line 422
    :cond_15
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    :goto_11
    add-int/lit8 v10, v10, 0x1

    .line 426
    .line 427
    goto :goto_10

    .line 428
    :catchall_0
    move-exception v0

    .line 429
    monitor-exit v12

    .line 430
    throw v0

    .line 431
    :cond_16
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-nez v4, :cond_17

    .line 436
    .line 437
    goto :goto_12

    .line 438
    :cond_17
    const/4 v8, 0x1

    .line 439
    goto/16 :goto_8

    .line 440
    .line 441
    :cond_18
    new-instance v0, Ljava/net/UnknownHostException;

    .line 442
    .line 443
    new-instance v2, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 446
    .line 447
    .line 448
    iget-object v3, v11, Lv4/a;->b:Lv4/l;

    .line 449
    .line 450
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    const-string v3, " returned no addresses for "

    .line 454
    .line 455
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-direct {v0, v2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v0

    .line 469
    :catch_0
    move-exception v0

    .line 470
    new-instance v2, Ljava/net/UnknownHostException;

    .line 471
    .line 472
    const-string v3, "Broken system behaviour for dns lookup of "

    .line 473
    .line 474
    invoke-virtual {v3, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-direct {v2, v3}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 482
    .line 483
    .line 484
    throw v2

    .line 485
    :cond_19
    new-instance v0, Ljava/net/UnknownHostException;

    .line 486
    .line 487
    const-string v2, "hostname == null"

    .line 488
    .line 489
    invoke-direct {v0, v2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    throw v0

    .line 493
    :cond_1a
    new-instance v0, Ljava/net/SocketException;

    .line 494
    .line 495
    new-instance v2, Ljava/lang/StringBuilder;

    .line 496
    .line 497
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    const-string v3, ":"

    .line 504
    .line 505
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    const-string v3, "; port is out of range"

    .line 512
    .line 513
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    throw v0

    .line 524
    :cond_1b
    new-instance v0, Ljava/net/SocketException;

    .line 525
    .line 526
    new-instance v3, Ljava/lang/StringBuilder;

    .line 527
    .line 528
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    iget-object v4, v11, Lv4/a;->a:Lv4/q;

    .line 532
    .line 533
    iget-object v4, v4, Lv4/q;->d:Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    const-string v4, "; exhausted proxy configurations: "

    .line 539
    .line 540
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    iget-object v2, v2, Ly4/h;->d:Ljava/util/List;

    .line 544
    .line 545
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    throw v0

    .line 556
    :cond_1c
    :goto_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_1d

    .line 561
    .line 562
    iget-object v4, v2, Ly4/h;->g:Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 565
    .line 566
    .line 567
    iget-object v2, v2, Ly4/h;->g:Ljava/util/ArrayList;

    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 570
    .line 571
    .line 572
    :cond_1d
    new-instance v2, Ly4/h$a;

    .line 573
    .line 574
    invoke-direct {v2, v3}, Ly4/h$a;-><init>(Ljava/util/ArrayList;)V

    .line 575
    .line 576
    .line 577
    iput-object v2, v1, Ly4/d;->e:Ly4/h$a;

    .line 578
    .line 579
    const/4 v2, 0x1

    .line 580
    goto :goto_13

    .line 581
    :cond_1e
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 582
    .line 583
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 584
    .line 585
    .line 586
    throw v0

    .line 587
    :cond_1f
    move v2, v0

    .line 588
    :goto_13
    iget-object v3, v1, Ly4/d;->c:Ly4/f;

    .line 589
    .line 590
    monitor-enter v3

    .line 591
    :try_start_5
    iget-object v4, v1, Ly4/d;->a:Ly4/i;

    .line 592
    .line 593
    iget-object v8, v4, Ly4/i;->b:Ly4/f;

    .line 594
    .line 595
    monitor-enter v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 596
    :try_start_6
    iget-boolean v4, v4, Ly4/i;->m:Z

    .line 597
    .line 598
    monitor-exit v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 599
    if-nez v4, :cond_2a

    .line 600
    .line 601
    if-eqz v2, :cond_20

    .line 602
    .line 603
    :try_start_7
    iget-object v2, v1, Ly4/d;->e:Ly4/h$a;

    .line 604
    .line 605
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    new-instance v4, Ljava/util/ArrayList;

    .line 609
    .line 610
    iget-object v2, v2, Ly4/h$a;->a:Ljava/util/List;

    .line 611
    .line 612
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 613
    .line 614
    .line 615
    iget-object v2, v1, Ly4/d;->c:Ly4/f;

    .line 616
    .line 617
    iget-object v8, v1, Ly4/d;->b:Lv4/a;

    .line 618
    .line 619
    iget-object v10, v1, Ly4/d;->a:Ly4/i;

    .line 620
    .line 621
    invoke-virtual {v2, v8, v10, v4, v0}, Ly4/f;->c(Lv4/a;Ly4/i;Ljava/util/ArrayList;Z)Z

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    if-eqz v2, :cond_21

    .line 626
    .line 627
    iget-object v2, v1, Ly4/d;->a:Ly4/i;

    .line 628
    .line 629
    iget-object v7, v2, Ly4/i;->i:Ly4/e;

    .line 630
    .line 631
    const/4 v9, 0x1

    .line 632
    goto :goto_14

    .line 633
    :cond_20
    move-object v4, v5

    .line 634
    :cond_21
    :goto_14
    if-nez v9, :cond_25

    .line 635
    .line 636
    if-nez v6, :cond_24

    .line 637
    .line 638
    iget-object v2, v1, Ly4/d;->e:Ly4/h$a;

    .line 639
    .line 640
    iget v6, v2, Ly4/h$a;->b:I

    .line 641
    .line 642
    iget-object v7, v2, Ly4/h$a;->a:Ljava/util/List;

    .line 643
    .line 644
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 645
    .line 646
    .line 647
    move-result v7

    .line 648
    if-ge v6, v7, :cond_22

    .line 649
    .line 650
    const/4 v0, 0x1

    .line 651
    :cond_22
    if-eqz v0, :cond_23

    .line 652
    .line 653
    iget v0, v2, Ly4/h$a;->b:I

    .line 654
    .line 655
    add-int/lit8 v6, v0, 0x1

    .line 656
    .line 657
    iput v6, v2, Ly4/h$a;->b:I

    .line 658
    .line 659
    iget-object v2, v2, Ly4/h$a;->a:Ljava/util/List;

    .line 660
    .line 661
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    check-cast v0, Lv4/e0;

    .line 666
    .line 667
    move-object v6, v0

    .line 668
    goto :goto_15

    .line 669
    :cond_23
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 670
    .line 671
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 672
    .line 673
    .line 674
    throw v0

    .line 675
    :cond_24
    :goto_15
    new-instance v7, Ly4/e;

    .line 676
    .line 677
    iget-object v0, v1, Ly4/d;->c:Ly4/f;

    .line 678
    .line 679
    invoke-direct {v7, v0, v6}, Ly4/e;-><init>(Ly4/f;Lv4/e0;)V

    .line 680
    .line 681
    .line 682
    iput-object v7, v1, Ly4/d;->g:Ly4/e;

    .line 683
    .line 684
    :cond_25
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 685
    if-eqz v9, :cond_26

    .line 686
    .line 687
    goto :goto_17

    .line 688
    :cond_26
    iget-object v15, v1, Ly4/d;->d:Lv4/m;

    .line 689
    .line 690
    move-object v10, v7

    .line 691
    move/from16 v11, p2

    .line 692
    .line 693
    move/from16 v12, p3

    .line 694
    .line 695
    move/from16 v13, p4

    .line 696
    .line 697
    move/from16 v14, p1

    .line 698
    .line 699
    invoke-virtual/range {v10 .. v15}, Ly4/e;->c(IIIZLv4/m;)V

    .line 700
    .line 701
    .line 702
    iget-object v0, v1, Ly4/d;->c:Ly4/f;

    .line 703
    .line 704
    iget-object v0, v0, Ly4/f;->e:Lq3/b;

    .line 705
    .line 706
    iget-object v2, v7, Ly4/e;->c:Lv4/e0;

    .line 707
    .line 708
    invoke-virtual {v0, v2}, Lq3/b;->a(Lv4/e0;)V

    .line 709
    .line 710
    .line 711
    iget-object v2, v1, Ly4/d;->c:Ly4/f;

    .line 712
    .line 713
    monitor-enter v2

    .line 714
    :try_start_8
    iput-object v5, v1, Ly4/d;->g:Ly4/e;

    .line 715
    .line 716
    iget-object v0, v1, Ly4/d;->c:Ly4/f;

    .line 717
    .line 718
    iget-object v3, v1, Ly4/d;->b:Lv4/a;

    .line 719
    .line 720
    iget-object v8, v1, Ly4/d;->a:Ly4/i;

    .line 721
    .line 722
    const/4 v9, 0x1

    .line 723
    invoke-virtual {v0, v3, v8, v4, v9}, Ly4/f;->c(Lv4/a;Ly4/i;Ljava/util/ArrayList;Z)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-eqz v0, :cond_27

    .line 728
    .line 729
    iput-boolean v9, v7, Ly4/e;->k:Z

    .line 730
    .line 731
    iget-object v5, v7, Ly4/e;->e:Ljava/net/Socket;

    .line 732
    .line 733
    iget-object v0, v1, Ly4/d;->a:Ly4/i;

    .line 734
    .line 735
    iget-object v0, v0, Ly4/i;->i:Ly4/e;

    .line 736
    .line 737
    iput-object v6, v1, Ly4/d;->i:Lv4/e0;

    .line 738
    .line 739
    move-object v7, v0

    .line 740
    goto :goto_16

    .line 741
    :cond_27
    iget-object v0, v1, Ly4/d;->c:Ly4/f;

    .line 742
    .line 743
    iget-boolean v3, v0, Ly4/f;->f:Z

    .line 744
    .line 745
    if-nez v3, :cond_28

    .line 746
    .line 747
    const/4 v3, 0x1

    .line 748
    iput-boolean v3, v0, Ly4/f;->f:Z

    .line 749
    .line 750
    sget-object v3, Ly4/f;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 751
    .line 752
    iget-object v4, v0, Ly4/f;->c:Landroidx/appcompat/widget/k1;

    .line 753
    .line 754
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 755
    .line 756
    .line 757
    :cond_28
    iget-object v0, v0, Ly4/f;->d:Ljava/util/ArrayDeque;

    .line 758
    .line 759
    invoke-virtual {v0, v7}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    iget-object v0, v1, Ly4/d;->a:Ly4/i;

    .line 763
    .line 764
    iget-object v3, v0, Ly4/i;->i:Ly4/e;

    .line 765
    .line 766
    if-nez v3, :cond_29

    .line 767
    .line 768
    iput-object v7, v0, Ly4/i;->i:Ly4/e;

    .line 769
    .line 770
    iget-object v3, v7, Ly4/e;->p:Ljava/util/ArrayList;

    .line 771
    .line 772
    new-instance v4, Ly4/i$b;

    .line 773
    .line 774
    iget-object v6, v0, Ly4/i;->f:Ljava/lang/Object;

    .line 775
    .line 776
    invoke-direct {v4, v0, v6}, Ly4/i$b;-><init>(Ly4/i;Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    :goto_16
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 783
    invoke-static {v5}, Lw4/e;->c(Ljava/net/Socket;)V

    .line 784
    .line 785
    .line 786
    :goto_17
    iget-object v0, v1, Ly4/d;->d:Lv4/m;

    .line 787
    .line 788
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    return-object v7

    .line 792
    :catchall_1
    move-exception v0

    .line 793
    goto :goto_18

    .line 794
    :cond_29
    :try_start_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 795
    .line 796
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 797
    .line 798
    .line 799
    throw v0

    .line 800
    :goto_18
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 801
    throw v0

    .line 802
    :cond_2a
    :try_start_a
    new-instance v0, Ljava/io/IOException;

    .line 803
    .line 804
    const-string v2, "Canceled"

    .line 805
    .line 806
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 810
    :catchall_2
    move-exception v0

    .line 811
    :try_start_b
    monitor-exit v8
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 812
    :try_start_c
    throw v0

    .line 813
    :catchall_3
    move-exception v0

    .line 814
    monitor-exit v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 815
    throw v0

    .line 816
    :cond_2b
    :try_start_d
    new-instance v0, Ljava/io/IOException;

    .line 817
    .line 818
    const-string v3, "Canceled"

    .line 819
    .line 820
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 824
    :catchall_4
    move-exception v0

    .line 825
    :try_start_e
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 826
    :try_start_f
    throw v0

    .line 827
    :catchall_5
    move-exception v0

    .line 828
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 829
    throw v0
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public final b(IIIZZ)Ly4/e;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v1, v5, v2, v3, v4}, Ly4/d;->a(ZIII)Ly4/e;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    iget-object v7, v1, Ly4/d;->c:Ly4/f;

    .line 16
    .line 17
    monitor-enter v7

    .line 18
    :try_start_0
    iget v0, v6, Ly4/e;->m:I

    .line 19
    .line 20
    const/4 v8, 0x1

    .line 21
    const/4 v9, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v6, Ly4/e;->h:Lb5/g;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move v0, v8

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v0, v9

    .line 31
    :goto_1
    if-nez v0, :cond_1

    .line 32
    .line 33
    monitor-exit v7

    .line 34
    return-object v6

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_1
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_7

    .line 46
    .line 47
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_7

    .line 54
    .line 55
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    iget-object v7, v6, Ly4/e;->h:Lb5/g;

    .line 65
    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v10

    .line 72
    monitor-enter v7

    .line 73
    :try_start_1
    iget-boolean v0, v7, Lb5/g;->h:Z

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    iget-wide v12, v7, Lb5/g;->o:J

    .line 79
    .line 80
    iget-wide v14, v7, Lb5/g;->n:J

    .line 81
    .line 82
    cmp-long v0, v12, v14

    .line 83
    .line 84
    if-gez v0, :cond_4

    .line 85
    .line 86
    iget-wide v12, v7, Lb5/g;->p:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    cmp-long v0, v10, v12

    .line 89
    .line 90
    if-ltz v0, :cond_4

    .line 91
    .line 92
    :goto_2
    monitor-exit v7

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    monitor-exit v7

    .line 95
    goto :goto_4

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    monitor-exit v7

    .line 98
    throw v0

    .line 99
    :cond_5
    if-eqz p5, :cond_8

    .line 100
    .line 101
    :try_start_2
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/net/Socket;->getSoTimeout()I

    .line 104
    .line 105
    .line 106
    move-result v7
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 107
    :try_start_3
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 108
    .line 109
    invoke-virtual {v0, v8}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v6, Ly4/e;->i:Lf5/t;

    .line 113
    .line 114
    invoke-virtual {v0}, Lf5/t;->m()Z

    .line 115
    .line 116
    .line 117
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    :try_start_4
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    iget-object v0, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 127
    .line 128
    invoke-virtual {v0, v7}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :catchall_2
    move-exception v0

    .line 133
    iget-object v10, v6, Ly4/e;->e:Ljava/net/Socket;

    .line 134
    .line 135
    invoke-virtual {v10, v7}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 136
    .line 137
    .line 138
    throw v0
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 139
    :catch_0
    :cond_7
    :goto_3
    move v8, v9

    .line 140
    :catch_1
    :cond_8
    :goto_4
    if-nez v8, :cond_9

    .line 141
    .line 142
    invoke-virtual {v6}, Ly4/e;->h()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_9
    return-object v6

    .line 148
    :goto_5
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    throw v0
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
.end method

.method public final c()Z
    .locals 6

    .line 1
    iget-object v0, p0, Ly4/d;->c:Ly4/f;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly4/d;->i:Lv4/e0;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {p0}, Ly4/d;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Ly4/d;->a:Ly4/i;

    .line 18
    .line 19
    iget-object v1, v1, Ly4/i;->i:Ly4/e;

    .line 20
    .line 21
    iget-object v1, v1, Ly4/e;->c:Lv4/e0;

    .line 22
    .line 23
    iput-object v1, p0, Ly4/d;->i:Lv4/e0;

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return v2

    .line 27
    :cond_1
    iget-object v1, p0, Ly4/d;->e:Ly4/h$a;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget v4, v1, Ly4/h$a;->b:I

    .line 33
    .line 34
    iget-object v1, v1, Ly4/h$a;->a:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge v4, v1, :cond_2

    .line 41
    .line 42
    move v1, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move v1, v3

    .line 45
    :goto_0
    if-nez v1, :cond_8

    .line 46
    .line 47
    :cond_3
    iget-object v1, p0, Ly4/d;->f:Ly4/h;

    .line 48
    .line 49
    iget v4, v1, Ly4/h;->e:I

    .line 50
    .line 51
    iget-object v5, v1, Ly4/h;->d:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ge v4, v5, :cond_4

    .line 58
    .line 59
    move v4, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    move v4, v3

    .line 62
    :goto_1
    if-nez v4, :cond_6

    .line 63
    .line 64
    iget-object v1, v1, Ly4/h;->g:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    move v1, v3

    .line 74
    goto :goto_3

    .line 75
    :cond_6
    :goto_2
    move v1, v2

    .line 76
    :goto_3
    if-eqz v1, :cond_7

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_7
    move v2, v3

    .line 80
    :cond_8
    :goto_4
    monitor-exit v0

    .line 81
    return v2

    .line 82
    :catchall_0
    move-exception v1

    .line 83
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    throw v1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/d;->a:Ly4/i;

    .line 2
    .line 3
    iget-object v0, v0, Ly4/i;->i:Ly4/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, v0, Ly4/e;->l:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Ly4/e;->c:Lv4/e0;

    .line 12
    .line 13
    iget-object v0, v0, Lv4/e0;->a:Lv4/a;

    .line 14
    .line 15
    iget-object v0, v0, Lv4/a;->a:Lv4/q;

    .line 16
    .line 17
    iget-object v1, p0, Ly4/d;->b:Lv4/a;

    .line 18
    .line 19
    iget-object v1, v1, Lv4/a;->a:Lv4/q;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lw4/e;->p(Lv4/q;Lv4/q;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    return v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method
