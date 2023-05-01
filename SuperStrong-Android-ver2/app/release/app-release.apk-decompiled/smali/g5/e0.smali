.class public abstract Lg5/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lg5/d0;Ljava/lang/reflect/Method;)Lg5/k;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lg5/a0$a;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Lg5/a0$a;-><init>(Lg5/d0;Ljava/lang/reflect/Method;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lg5/a0$a;->c:[Ljava/lang/annotation/Annotation;

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    const/4 v5, 0x0

    .line 14
    move v6, v5

    .line 15
    :goto_0
    const/4 v7, 0x1

    .line 16
    const-string v8, "HEAD"

    .line 17
    .line 18
    iget-object v9, v2, Lg5/a0$a;->b:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    if-ge v6, v4, :cond_11

    .line 21
    .line 22
    aget-object v10, v3, v6

    .line 23
    .line 24
    instance-of v11, v10, Li5/b;

    .line 25
    .line 26
    if-eqz v11, :cond_0

    .line 27
    .line 28
    check-cast v10, Li5/b;

    .line 29
    .line 30
    invoke-interface {v10}, Li5/b;->value()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    const-string v8, "DELETE"

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    instance-of v11, v10, Li5/f;

    .line 38
    .line 39
    if-eqz v11, :cond_1

    .line 40
    .line 41
    check-cast v10, Li5/f;

    .line 42
    .line 43
    invoke-interface {v10}, Li5/f;->value()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const-string v8, "GET"

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    instance-of v11, v10, Li5/g;

    .line 51
    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    check-cast v10, Li5/g;

    .line 55
    .line 56
    invoke-interface {v10}, Li5/g;->value()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    instance-of v8, v10, Li5/n;

    .line 62
    .line 63
    if-eqz v8, :cond_3

    .line 64
    .line 65
    check-cast v10, Li5/n;

    .line 66
    .line 67
    invoke-interface {v10}, Li5/n;->value()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    const-string v9, "PATCH"

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    instance-of v8, v10, Li5/o;

    .line 75
    .line 76
    if-eqz v8, :cond_4

    .line 77
    .line 78
    check-cast v10, Li5/o;

    .line 79
    .line 80
    invoke-interface {v10}, Li5/o;->value()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    const-string v9, "POST"

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    instance-of v8, v10, Li5/p;

    .line 88
    .line 89
    if-eqz v8, :cond_5

    .line 90
    .line 91
    check-cast v10, Li5/p;

    .line 92
    .line 93
    invoke-interface {v10}, Li5/p;->value()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    const-string v9, "PUT"

    .line 98
    .line 99
    :goto_1
    invoke-virtual {v2, v9, v8, v7}, Lg5/a0$a;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_5
    instance-of v8, v10, Li5/m;

    .line 105
    .line 106
    if-eqz v8, :cond_6

    .line 107
    .line 108
    check-cast v10, Li5/m;

    .line 109
    .line 110
    invoke-interface {v10}, Li5/m;->value()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const-string v8, "OPTIONS"

    .line 115
    .line 116
    :goto_2
    invoke-virtual {v2, v8, v7, v5}, Lg5/a0$a;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_5

    .line 120
    .line 121
    :cond_6
    instance-of v8, v10, Li5/h;

    .line 122
    .line 123
    if-eqz v8, :cond_7

    .line 124
    .line 125
    check-cast v10, Li5/h;

    .line 126
    .line 127
    invoke-interface {v10}, Li5/h;->method()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-interface {v10}, Li5/h;->path()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-interface {v10}, Li5/h;->hasBody()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    invoke-virtual {v2, v7, v8, v9}, Lg5/a0$a;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :cond_7
    instance-of v8, v10, Li5/k;

    .line 145
    .line 146
    if-eqz v8, :cond_c

    .line 147
    .line 148
    check-cast v10, Li5/k;

    .line 149
    .line 150
    invoke-interface {v10}, Li5/k;->value()[Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    array-length v10, v8

    .line 155
    if-eqz v10, :cond_b

    .line 156
    .line 157
    new-instance v10, Lv4/p$a;

    .line 158
    .line 159
    invoke-direct {v10}, Lv4/p$a;-><init>()V

    .line 160
    .line 161
    .line 162
    array-length v11, v8

    .line 163
    move v12, v5

    .line 164
    :goto_3
    if-ge v12, v11, :cond_a

    .line 165
    .line 166
    aget-object v13, v8, v12

    .line 167
    .line 168
    const/16 v14, 0x3a

    .line 169
    .line 170
    invoke-virtual {v13, v14}, Ljava/lang/String;->indexOf(I)I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    const/4 v15, -0x1

    .line 175
    if-eq v14, v15, :cond_9

    .line 176
    .line 177
    if-eqz v14, :cond_9

    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    sub-int/2addr v15, v7

    .line 184
    if-eq v14, v15, :cond_9

    .line 185
    .line 186
    invoke-virtual {v13, v5, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    add-int/lit8 v14, v14, 0x1

    .line 191
    .line 192
    invoke-virtual {v13, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    const-string v14, "Content-Type"

    .line 201
    .line 202
    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    if-eqz v14, :cond_8

    .line 207
    .line 208
    :try_start_0
    invoke-static {v13}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    iput-object v14, v2, Lg5/a0$a;->t:Lv4/s;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :catch_0
    move-exception v0

    .line 216
    new-array v1, v7, [Ljava/lang/Object;

    .line 217
    .line 218
    aput-object v13, v1, v5

    .line 219
    .line 220
    const-string v2, "Malformed content type: %s"

    .line 221
    .line 222
    invoke-static {v9, v0, v2, v1}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    throw v0

    .line 227
    :cond_8
    invoke-static {v15}, Lv4/p;->a(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v13, v15}, Lv4/p;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v15, v13}, Lv4/p$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_9
    new-array v0, v7, [Ljava/lang/Object;

    .line 240
    .line 241
    aput-object v13, v0, v5

    .line 242
    .line 243
    const-string v1, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    .line 244
    .line 245
    const/4 v2, 0x0

    .line 246
    invoke-static {v9, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    throw v0

    .line 251
    :cond_a
    new-instance v7, Lv4/p;

    .line 252
    .line 253
    invoke-direct {v7, v10}, Lv4/p;-><init>(Lv4/p$a;)V

    .line 254
    .line 255
    .line 256
    iput-object v7, v2, Lg5/a0$a;->s:Lv4/p;

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_b
    const/4 v0, 0x0

    .line 260
    new-array v1, v5, [Ljava/lang/Object;

    .line 261
    .line 262
    const-string v2, "@Headers annotation is empty."

    .line 263
    .line 264
    invoke-static {v9, v0, v2, v1}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    throw v0

    .line 269
    :cond_c
    const/4 v8, 0x0

    .line 270
    instance-of v11, v10, Li5/l;

    .line 271
    .line 272
    const-string v12, "Only one encoding annotation is allowed."

    .line 273
    .line 274
    if-eqz v11, :cond_e

    .line 275
    .line 276
    iget-boolean v10, v2, Lg5/a0$a;->p:Z

    .line 277
    .line 278
    if-nez v10, :cond_d

    .line 279
    .line 280
    iput-boolean v7, v2, Lg5/a0$a;->q:Z

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_d
    new-array v0, v5, [Ljava/lang/Object;

    .line 284
    .line 285
    invoke-static {v9, v8, v12, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    throw v0

    .line 290
    :cond_e
    instance-of v10, v10, Li5/e;

    .line 291
    .line 292
    if-eqz v10, :cond_10

    .line 293
    .line 294
    iget-boolean v10, v2, Lg5/a0$a;->q:Z

    .line 295
    .line 296
    if-nez v10, :cond_f

    .line 297
    .line 298
    iput-boolean v7, v2, Lg5/a0$a;->p:Z

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_f
    new-array v0, v5, [Ljava/lang/Object;

    .line 302
    .line 303
    invoke-static {v9, v8, v12, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    throw v0

    .line 308
    :cond_10
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_11
    iget-object v3, v2, Lg5/a0$a;->n:Ljava/lang/String;

    .line 313
    .line 314
    if-eqz v3, :cond_7d

    .line 315
    .line 316
    iget-boolean v3, v2, Lg5/a0$a;->o:Z

    .line 317
    .line 318
    if-nez v3, :cond_14

    .line 319
    .line 320
    iget-boolean v3, v2, Lg5/a0$a;->q:Z

    .line 321
    .line 322
    if-nez v3, :cond_13

    .line 323
    .line 324
    iget-boolean v3, v2, Lg5/a0$a;->p:Z

    .line 325
    .line 326
    if-nez v3, :cond_12

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_12
    new-array v0, v5, [Ljava/lang/Object;

    .line 330
    .line 331
    const-string v1, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 332
    .line 333
    const/4 v2, 0x0

    .line 334
    invoke-static {v9, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    throw v0

    .line 339
    :cond_13
    const/4 v0, 0x0

    .line 340
    new-array v1, v5, [Ljava/lang/Object;

    .line 341
    .line 342
    const-string v2, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 343
    .line 344
    invoke-static {v9, v0, v2, v1}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    throw v0

    .line 349
    :cond_14
    :goto_6
    iget-object v3, v2, Lg5/a0$a;->d:[[Ljava/lang/annotation/Annotation;

    .line 350
    .line 351
    array-length v4, v3

    .line 352
    new-array v6, v4, [Lg5/x;

    .line 353
    .line 354
    iput-object v6, v2, Lg5/a0$a;->v:[Lg5/x;

    .line 355
    .line 356
    add-int/lit8 v6, v4, -0x1

    .line 357
    .line 358
    move-object v11, v2

    .line 359
    move v10, v7

    .line 360
    move v7, v5

    .line 361
    :goto_7
    if-ge v5, v4, :cond_68

    .line 362
    .line 363
    iget-object v12, v11, Lg5/a0$a;->v:[Lg5/x;

    .line 364
    .line 365
    iget-object v13, v11, Lg5/a0$a;->e:[Ljava/lang/reflect/Type;

    .line 366
    .line 367
    aget-object v13, v13, v5

    .line 368
    .line 369
    aget-object v14, v3, v5

    .line 370
    .line 371
    if-ne v5, v6, :cond_15

    .line 372
    .line 373
    move v7, v10

    .line 374
    :cond_15
    if-eqz v14, :cond_65

    .line 375
    .line 376
    array-length v10, v14

    .line 377
    const/4 v15, 0x0

    .line 378
    const/16 v16, 0x0

    .line 379
    .line 380
    move-object/from16 v17, v16

    .line 381
    .line 382
    move-object/from16 v16, v3

    .line 383
    .line 384
    move v3, v15

    .line 385
    move-object v15, v11

    .line 386
    :goto_8
    if-ge v3, v10, :cond_64

    .line 387
    .line 388
    move/from16 v18, v4

    .line 389
    .line 390
    aget-object v4, v14, v3

    .line 391
    .line 392
    move/from16 v19, v6

    .line 393
    .line 394
    instance-of v6, v4, Li5/y;

    .line 395
    .line 396
    move/from16 v20, v10

    .line 397
    .line 398
    const-string v10, "@Path parameters may not be used with @Url."

    .line 399
    .line 400
    const-class v1, Ljava/lang/String;

    .line 401
    .line 402
    if-eqz v6, :cond_1e

    .line 403
    .line 404
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 405
    .line 406
    .line 407
    iget-boolean v4, v15, Lg5/a0$a;->m:Z

    .line 408
    .line 409
    if-nez v4, :cond_1d

    .line 410
    .line 411
    iget-boolean v4, v15, Lg5/a0$a;->i:Z

    .line 412
    .line 413
    if-nez v4, :cond_1c

    .line 414
    .line 415
    iget-boolean v4, v15, Lg5/a0$a;->j:Z

    .line 416
    .line 417
    if-nez v4, :cond_1b

    .line 418
    .line 419
    iget-boolean v4, v15, Lg5/a0$a;->k:Z

    .line 420
    .line 421
    if-nez v4, :cond_1a

    .line 422
    .line 423
    iget-boolean v4, v15, Lg5/a0$a;->l:Z

    .line 424
    .line 425
    if-nez v4, :cond_19

    .line 426
    .line 427
    iget-object v4, v15, Lg5/a0$a;->r:Ljava/lang/String;

    .line 428
    .line 429
    if-nez v4, :cond_18

    .line 430
    .line 431
    const/4 v4, 0x1

    .line 432
    iput-boolean v4, v15, Lg5/a0$a;->m:Z

    .line 433
    .line 434
    const-class v4, Lv4/q;

    .line 435
    .line 436
    if-eq v13, v4, :cond_17

    .line 437
    .line 438
    if-eq v13, v1, :cond_17

    .line 439
    .line 440
    const-class v1, Ljava/net/URI;

    .line 441
    .line 442
    if-eq v13, v1, :cond_17

    .line 443
    .line 444
    instance-of v1, v13, Ljava/lang/Class;

    .line 445
    .line 446
    if-eqz v1, :cond_16

    .line 447
    .line 448
    move-object v1, v13

    .line 449
    check-cast v1, Ljava/lang/Class;

    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    const-string v4, "android.net.Uri"

    .line 456
    .line 457
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-eqz v1, :cond_16

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_16
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    .line 465
    .line 466
    const/4 v1, 0x0

    .line 467
    new-array v1, v1, [Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    throw v0

    .line 474
    :cond_17
    :goto_9
    new-instance v1, Lg5/x$n;

    .line 475
    .line 476
    invoke-direct {v1, v5, v9}, Lg5/x$n;-><init>(ILjava/lang/reflect/Method;)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v21, v8

    .line 480
    .line 481
    goto/16 :goto_a

    .line 482
    .line 483
    :cond_18
    const/4 v0, 0x0

    .line 484
    const/4 v1, 0x1

    .line 485
    new-array v1, v1, [Ljava/lang/Object;

    .line 486
    .line 487
    iget-object v2, v15, Lg5/a0$a;->n:Ljava/lang/String;

    .line 488
    .line 489
    aput-object v2, v1, v0

    .line 490
    .line 491
    const-string v0, "@Url cannot be used with @%s URL"

    .line 492
    .line 493
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    throw v0

    .line 498
    :cond_19
    const/4 v0, 0x0

    .line 499
    const-string v1, "A @Url parameter must not come after a @QueryMap."

    .line 500
    .line 501
    new-array v0, v0, [Ljava/lang/Object;

    .line 502
    .line 503
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    throw v0

    .line 508
    :cond_1a
    const/4 v0, 0x0

    .line 509
    const-string v1, "A @Url parameter must not come after a @QueryName."

    .line 510
    .line 511
    new-array v0, v0, [Ljava/lang/Object;

    .line 512
    .line 513
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    throw v0

    .line 518
    :cond_1b
    const/4 v0, 0x0

    .line 519
    const-string v1, "A @Url parameter must not come after a @Query."

    .line 520
    .line 521
    new-array v0, v0, [Ljava/lang/Object;

    .line 522
    .line 523
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    throw v0

    .line 528
    :cond_1c
    const/4 v0, 0x0

    .line 529
    new-array v0, v0, [Ljava/lang/Object;

    .line 530
    .line 531
    invoke-static {v9, v5, v10, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    throw v0

    .line 536
    :cond_1d
    const/4 v0, 0x0

    .line 537
    const-string v1, "Multiple @Url method annotations found."

    .line 538
    .line 539
    new-array v0, v0, [Ljava/lang/Object;

    .line 540
    .line 541
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    throw v0

    .line 546
    :cond_1e
    instance-of v6, v4, Li5/s;

    .line 547
    .line 548
    move-object/from16 v21, v8

    .line 549
    .line 550
    iget-object v8, v15, Lg5/a0$a;->a:Lg5/d0;

    .line 551
    .line 552
    if-eqz v6, :cond_26

    .line 553
    .line 554
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 555
    .line 556
    .line 557
    iget-boolean v1, v15, Lg5/a0$a;->j:Z

    .line 558
    .line 559
    if-nez v1, :cond_25

    .line 560
    .line 561
    iget-boolean v1, v15, Lg5/a0$a;->k:Z

    .line 562
    .line 563
    if-nez v1, :cond_24

    .line 564
    .line 565
    iget-boolean v1, v15, Lg5/a0$a;->l:Z

    .line 566
    .line 567
    if-nez v1, :cond_23

    .line 568
    .line 569
    iget-boolean v1, v15, Lg5/a0$a;->m:Z

    .line 570
    .line 571
    if-nez v1, :cond_22

    .line 572
    .line 573
    iget-object v1, v15, Lg5/a0$a;->r:Ljava/lang/String;

    .line 574
    .line 575
    if-eqz v1, :cond_21

    .line 576
    .line 577
    const/4 v1, 0x1

    .line 578
    iput-boolean v1, v15, Lg5/a0$a;->i:Z

    .line 579
    .line 580
    check-cast v4, Li5/s;

    .line 581
    .line 582
    invoke-interface {v4}, Li5/s;->value()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    sget-object v6, Lg5/a0$a;->y:Ljava/util/regex/Pattern;

    .line 587
    .line 588
    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 589
    .line 590
    .line 591
    move-result-object v6

    .line 592
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 593
    .line 594
    .line 595
    move-result v6

    .line 596
    if-eqz v6, :cond_20

    .line 597
    .line 598
    iget-object v6, v15, Lg5/a0$a;->u:Ljava/util/LinkedHashSet;

    .line 599
    .line 600
    invoke-interface {v6, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-eqz v6, :cond_1f

    .line 605
    .line 606
    invoke-virtual {v8, v13, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 607
    .line 608
    .line 609
    new-instance v6, Lg5/x$i;

    .line 610
    .line 611
    iget-object v8, v15, Lg5/a0$a;->b:Ljava/lang/reflect/Method;

    .line 612
    .line 613
    invoke-interface {v4}, Li5/s;->encoded()Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    invoke-direct {v6, v8, v5, v1, v4}, Lg5/x$i;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Z)V

    .line 618
    .line 619
    .line 620
    move-object v1, v6

    .line 621
    :goto_a
    move/from16 v23, v7

    .line 622
    .line 623
    move-object/from16 v22, v12

    .line 624
    .line 625
    goto/16 :goto_c

    .line 626
    .line 627
    :cond_1f
    const/4 v0, 0x2

    .line 628
    new-array v0, v0, [Ljava/lang/Object;

    .line 629
    .line 630
    iget-object v2, v15, Lg5/a0$a;->r:Ljava/lang/String;

    .line 631
    .line 632
    const/4 v3, 0x0

    .line 633
    aput-object v2, v0, v3

    .line 634
    .line 635
    const/4 v2, 0x1

    .line 636
    aput-object v1, v0, v2

    .line 637
    .line 638
    const-string v1, "URL \"%s\" does not contain \"{%s}\"."

    .line 639
    .line 640
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    throw v0

    .line 645
    :cond_20
    const/4 v0, 0x1

    .line 646
    const/4 v2, 0x0

    .line 647
    const/4 v3, 0x2

    .line 648
    new-array v3, v3, [Ljava/lang/Object;

    .line 649
    .line 650
    sget-object v4, Lg5/a0$a;->x:Ljava/util/regex/Pattern;

    .line 651
    .line 652
    invoke-virtual {v4}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    aput-object v4, v3, v2

    .line 657
    .line 658
    aput-object v1, v3, v0

    .line 659
    .line 660
    const-string v0, "@Path parameter name must match %s. Found: %s"

    .line 661
    .line 662
    invoke-static {v9, v5, v0, v3}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    throw v0

    .line 667
    :cond_21
    const/4 v0, 0x1

    .line 668
    const/4 v1, 0x0

    .line 669
    new-array v0, v0, [Ljava/lang/Object;

    .line 670
    .line 671
    iget-object v2, v15, Lg5/a0$a;->n:Ljava/lang/String;

    .line 672
    .line 673
    aput-object v2, v0, v1

    .line 674
    .line 675
    const-string v1, "@Path can only be used with relative url on @%s"

    .line 676
    .line 677
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    throw v0

    .line 682
    :cond_22
    const/4 v0, 0x0

    .line 683
    new-array v0, v0, [Ljava/lang/Object;

    .line 684
    .line 685
    invoke-static {v9, v5, v10, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    throw v0

    .line 690
    :cond_23
    const/4 v0, 0x0

    .line 691
    const-string v1, "A @Path parameter must not come after a @QueryMap."

    .line 692
    .line 693
    new-array v0, v0, [Ljava/lang/Object;

    .line 694
    .line 695
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    throw v0

    .line 700
    :cond_24
    const/4 v0, 0x0

    .line 701
    const-string v1, "A @Path parameter must not come after a @QueryName."

    .line 702
    .line 703
    new-array v0, v0, [Ljava/lang/Object;

    .line 704
    .line 705
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    throw v0

    .line 710
    :cond_25
    const/4 v0, 0x0

    .line 711
    const-string v1, "A @Path parameter must not come after a @Query."

    .line 712
    .line 713
    new-array v0, v0, [Ljava/lang/Object;

    .line 714
    .line 715
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    throw v0

    .line 720
    :cond_26
    instance-of v6, v4, Li5/t;

    .line 721
    .line 722
    const-string v10, "<String>)"

    .line 723
    .line 724
    const-string v0, " must include generic type (e.g., "

    .line 725
    .line 726
    move-object/from16 v22, v12

    .line 727
    .line 728
    const-class v12, Ljava/lang/Iterable;

    .line 729
    .line 730
    if-eqz v6, :cond_2a

    .line 731
    .line 732
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 733
    .line 734
    .line 735
    check-cast v4, Li5/t;

    .line 736
    .line 737
    invoke-interface {v4}, Li5/t;->value()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    invoke-interface {v4}, Li5/t;->encoded()Z

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    move/from16 v23, v7

    .line 750
    .line 751
    const/4 v7, 0x1

    .line 752
    iput-boolean v7, v15, Lg5/a0$a;->j:Z

    .line 753
    .line 754
    invoke-virtual {v12, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 755
    .line 756
    .line 757
    move-result v7

    .line 758
    if-eqz v7, :cond_28

    .line 759
    .line 760
    instance-of v7, v13, Ljava/lang/reflect/ParameterizedType;

    .line 761
    .line 762
    if-eqz v7, :cond_27

    .line 763
    .line 764
    move-object v0, v13

    .line 765
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 766
    .line 767
    const/4 v6, 0x0

    .line 768
    invoke-static {v6, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 773
    .line 774
    .line 775
    new-instance v0, Lg5/x$j;

    .line 776
    .line 777
    invoke-direct {v0, v1, v4}, Lg5/x$j;-><init>(Ljava/lang/String;Z)V

    .line 778
    .line 779
    .line 780
    new-instance v1, Lg5/v;

    .line 781
    .line 782
    invoke-direct {v1, v0}, Lg5/v;-><init>(Lg5/x;)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_c

    .line 786
    .line 787
    :cond_27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 788
    .line 789
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    const/4 v1, 0x0

    .line 817
    new-array v1, v1, [Ljava/lang/Object;

    .line 818
    .line 819
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    throw v0

    .line 824
    :cond_28
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_29

    .line 829
    .line 830
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    invoke-static {v0}, Lg5/a0$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 839
    .line 840
    .line 841
    new-instance v0, Lg5/x$j;

    .line 842
    .line 843
    invoke-direct {v0, v1, v4}, Lg5/x$j;-><init>(Ljava/lang/String;Z)V

    .line 844
    .line 845
    .line 846
    new-instance v1, Lg5/w;

    .line 847
    .line 848
    invoke-direct {v1, v0}, Lg5/w;-><init>(Lg5/x;)V

    .line 849
    .line 850
    .line 851
    goto/16 :goto_c

    .line 852
    .line 853
    :cond_29
    invoke-virtual {v8, v13, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 854
    .line 855
    .line 856
    new-instance v0, Lg5/x$j;

    .line 857
    .line 858
    invoke-direct {v0, v1, v4}, Lg5/x$j;-><init>(Ljava/lang/String;Z)V

    .line 859
    .line 860
    .line 861
    :goto_b
    move-object v1, v0

    .line 862
    goto/16 :goto_c

    .line 863
    .line 864
    :cond_2a
    move/from16 v23, v7

    .line 865
    .line 866
    instance-of v6, v4, Li5/v;

    .line 867
    .line 868
    if-eqz v6, :cond_2e

    .line 869
    .line 870
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 871
    .line 872
    .line 873
    check-cast v4, Li5/v;

    .line 874
    .line 875
    invoke-interface {v4}, Li5/v;->encoded()Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    move-result-object v4

    .line 883
    const/4 v6, 0x1

    .line 884
    iput-boolean v6, v15, Lg5/a0$a;->k:Z

    .line 885
    .line 886
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 887
    .line 888
    .line 889
    move-result v6

    .line 890
    if-eqz v6, :cond_2c

    .line 891
    .line 892
    instance-of v6, v13, Ljava/lang/reflect/ParameterizedType;

    .line 893
    .line 894
    if-eqz v6, :cond_2b

    .line 895
    .line 896
    move-object v0, v13

    .line 897
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 898
    .line 899
    const/4 v4, 0x0

    .line 900
    invoke-static {v4, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 905
    .line 906
    .line 907
    new-instance v0, Lg5/x$l;

    .line 908
    .line 909
    invoke-direct {v0, v1}, Lg5/x$l;-><init>(Z)V

    .line 910
    .line 911
    .line 912
    new-instance v1, Lg5/v;

    .line 913
    .line 914
    invoke-direct {v1, v0}, Lg5/v;-><init>(Lg5/x;)V

    .line 915
    .line 916
    .line 917
    goto :goto_c

    .line 918
    :cond_2b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 919
    .line 920
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    const/4 v1, 0x0

    .line 948
    new-array v1, v1, [Ljava/lang/Object;

    .line 949
    .line 950
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    throw v0

    .line 955
    :cond_2c
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    if-eqz v0, :cond_2d

    .line 960
    .line 961
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-static {v0}, Lg5/a0$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 970
    .line 971
    .line 972
    new-instance v0, Lg5/x$l;

    .line 973
    .line 974
    invoke-direct {v0, v1}, Lg5/x$l;-><init>(Z)V

    .line 975
    .line 976
    .line 977
    new-instance v1, Lg5/w;

    .line 978
    .line 979
    invoke-direct {v1, v0}, Lg5/w;-><init>(Lg5/x;)V

    .line 980
    .line 981
    .line 982
    goto :goto_c

    .line 983
    :cond_2d
    invoke-virtual {v8, v13, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 984
    .line 985
    .line 986
    new-instance v0, Lg5/x$l;

    .line 987
    .line 988
    invoke-direct {v0, v1}, Lg5/x$l;-><init>(Z)V

    .line 989
    .line 990
    .line 991
    goto/16 :goto_b

    .line 992
    .line 993
    :goto_c
    move-object v0, v2

    .line 994
    move/from16 v24, v3

    .line 995
    .line 996
    goto/16 :goto_16

    .line 997
    .line 998
    :cond_2e
    instance-of v6, v4, Li5/u;

    .line 999
    .line 1000
    const-string v7, "Map must include generic types (e.g., Map<String, String>)"

    .line 1001
    .line 1002
    move/from16 v24, v3

    .line 1003
    .line 1004
    const-class v3, Ljava/util/Map;

    .line 1005
    .line 1006
    if-eqz v6, :cond_32

    .line 1007
    .line 1008
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1009
    .line 1010
    .line 1011
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    const/4 v6, 0x1

    .line 1016
    iput-boolean v6, v15, Lg5/a0$a;->l:Z

    .line 1017
    .line 1018
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v3

    .line 1022
    if-eqz v3, :cond_31

    .line 1023
    .line 1024
    invoke-static {v13, v0}, Lg5/h0;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 1029
    .line 1030
    if-eqz v3, :cond_30

    .line 1031
    .line 1032
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1033
    .line 1034
    const/4 v3, 0x0

    .line 1035
    invoke-static {v3, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v3

    .line 1039
    if-ne v1, v3, :cond_2f

    .line 1040
    .line 1041
    invoke-static {v6, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v0, Lg5/x$k;

    .line 1049
    .line 1050
    check-cast v4, Li5/u;

    .line 1051
    .line 1052
    invoke-interface {v4}, Li5/u;->encoded()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v1

    .line 1056
    invoke-direct {v0, v9, v5, v1}, Lg5/x$k;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 1057
    .line 1058
    .line 1059
    goto/16 :goto_e

    .line 1060
    .line 1061
    :cond_2f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    const-string v1, "@QueryMap keys must be of type String: "

    .line 1064
    .line 1065
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    const/4 v1, 0x0

    .line 1076
    new-array v1, v1, [Ljava/lang/Object;

    .line 1077
    .line 1078
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    throw v0

    .line 1083
    :cond_30
    const/4 v0, 0x0

    .line 1084
    new-array v0, v0, [Ljava/lang/Object;

    .line 1085
    .line 1086
    invoke-static {v9, v5, v7, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    throw v0

    .line 1091
    :cond_31
    const/4 v0, 0x0

    .line 1092
    const-string v1, "@QueryMap parameter type must be Map."

    .line 1093
    .line 1094
    new-array v0, v0, [Ljava/lang/Object;

    .line 1095
    .line 1096
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    throw v0

    .line 1101
    :cond_32
    instance-of v6, v4, Li5/i;

    .line 1102
    .line 1103
    if-eqz v6, :cond_36

    .line 1104
    .line 1105
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1106
    .line 1107
    .line 1108
    check-cast v4, Li5/i;

    .line 1109
    .line 1110
    invoke-interface {v4}, Li5/i;->value()Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v3

    .line 1118
    invoke-virtual {v12, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    if-eqz v4, :cond_34

    .line 1123
    .line 1124
    instance-of v4, v13, Ljava/lang/reflect/ParameterizedType;

    .line 1125
    .line 1126
    if-eqz v4, :cond_33

    .line 1127
    .line 1128
    move-object v0, v13

    .line 1129
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1130
    .line 1131
    const/4 v3, 0x0

    .line 1132
    invoke-static {v3, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1137
    .line 1138
    .line 1139
    new-instance v0, Lg5/x$d;

    .line 1140
    .line 1141
    invoke-direct {v0, v1}, Lg5/x$d;-><init>(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    new-instance v1, Lg5/v;

    .line 1145
    .line 1146
    invoke-direct {v1, v0}, Lg5/v;-><init>(Lg5/x;)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_d

    .line 1150
    :cond_33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    const/4 v1, 0x0

    .line 1180
    new-array v1, v1, [Ljava/lang/Object;

    .line 1181
    .line 1182
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    throw v0

    .line 1187
    :cond_34
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 1188
    .line 1189
    .line 1190
    move-result v0

    .line 1191
    if-eqz v0, :cond_35

    .line 1192
    .line 1193
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    invoke-static {v0}, Lg5/a0$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1202
    .line 1203
    .line 1204
    new-instance v0, Lg5/x$d;

    .line 1205
    .line 1206
    invoke-direct {v0, v1}, Lg5/x$d;-><init>(Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    new-instance v1, Lg5/w;

    .line 1210
    .line 1211
    invoke-direct {v1, v0}, Lg5/w;-><init>(Lg5/x;)V

    .line 1212
    .line 1213
    .line 1214
    :goto_d
    move-object v0, v1

    .line 1215
    goto/16 :goto_e

    .line 1216
    .line 1217
    :cond_35
    invoke-virtual {v8, v13, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1218
    .line 1219
    .line 1220
    new-instance v0, Lg5/x$d;

    .line 1221
    .line 1222
    invoke-direct {v0, v1}, Lg5/x$d;-><init>(Ljava/lang/String;)V

    .line 1223
    .line 1224
    .line 1225
    goto/16 :goto_e

    .line 1226
    .line 1227
    :cond_36
    instance-of v6, v4, Li5/j;

    .line 1228
    .line 1229
    if-eqz v6, :cond_3b

    .line 1230
    .line 1231
    const-class v0, Lv4/p;

    .line 1232
    .line 1233
    if-ne v13, v0, :cond_37

    .line 1234
    .line 1235
    new-instance v0, Lg5/x$f;

    .line 1236
    .line 1237
    invoke-direct {v0, v5, v9}, Lg5/x$f;-><init>(ILjava/lang/reflect/Method;)V

    .line 1238
    .line 1239
    .line 1240
    goto/16 :goto_e

    .line 1241
    .line 1242
    :cond_37
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v3

    .line 1253
    if-eqz v3, :cond_3a

    .line 1254
    .line 1255
    invoke-static {v13, v0}, Lg5/h0;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 1260
    .line 1261
    if-eqz v3, :cond_39

    .line 1262
    .line 1263
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1264
    .line 1265
    const/4 v3, 0x0

    .line 1266
    invoke-static {v3, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    if-ne v1, v3, :cond_38

    .line 1271
    .line 1272
    const/4 v1, 0x1

    .line 1273
    invoke-static {v1, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1278
    .line 1279
    .line 1280
    new-instance v0, Lg5/x$e;

    .line 1281
    .line 1282
    invoke-direct {v0, v9, v5}, Lg5/x$e;-><init>(Ljava/lang/reflect/Method;I)V

    .line 1283
    .line 1284
    .line 1285
    goto/16 :goto_e

    .line 1286
    .line 1287
    :cond_38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1288
    .line 1289
    const-string v1, "@HeaderMap keys must be of type String: "

    .line 1290
    .line 1291
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    const/4 v1, 0x0

    .line 1302
    new-array v1, v1, [Ljava/lang/Object;

    .line 1303
    .line 1304
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    throw v0

    .line 1309
    :cond_39
    const/4 v0, 0x0

    .line 1310
    new-array v0, v0, [Ljava/lang/Object;

    .line 1311
    .line 1312
    invoke-static {v9, v5, v7, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    throw v0

    .line 1317
    :cond_3a
    const/4 v0, 0x0

    .line 1318
    const-string v1, "@HeaderMap parameter type must be Map."

    .line 1319
    .line 1320
    new-array v0, v0, [Ljava/lang/Object;

    .line 1321
    .line 1322
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    throw v0

    .line 1327
    :cond_3b
    instance-of v6, v4, Li5/c;

    .line 1328
    .line 1329
    if-eqz v6, :cond_40

    .line 1330
    .line 1331
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1332
    .line 1333
    .line 1334
    iget-boolean v1, v15, Lg5/a0$a;->p:Z

    .line 1335
    .line 1336
    if-eqz v1, :cond_3f

    .line 1337
    .line 1338
    check-cast v4, Li5/c;

    .line 1339
    .line 1340
    invoke-interface {v4}, Li5/c;->value()Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    invoke-interface {v4}, Li5/c;->encoded()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v3

    .line 1348
    const/4 v4, 0x1

    .line 1349
    iput-boolean v4, v15, Lg5/a0$a;->f:Z

    .line 1350
    .line 1351
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v4

    .line 1355
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v6

    .line 1359
    if-eqz v6, :cond_3d

    .line 1360
    .line 1361
    instance-of v6, v13, Ljava/lang/reflect/ParameterizedType;

    .line 1362
    .line 1363
    if-eqz v6, :cond_3c

    .line 1364
    .line 1365
    move-object v0, v13

    .line 1366
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1367
    .line 1368
    const/4 v4, 0x0

    .line 1369
    invoke-static {v4, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1374
    .line 1375
    .line 1376
    new-instance v0, Lg5/x$b;

    .line 1377
    .line 1378
    invoke-direct {v0, v1, v3}, Lg5/x$b;-><init>(Ljava/lang/String;Z)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v1, Lg5/v;

    .line 1382
    .line 1383
    invoke-direct {v1, v0}, Lg5/v;-><init>(Lg5/x;)V

    .line 1384
    .line 1385
    .line 1386
    goto/16 :goto_d

    .line 1387
    .line 1388
    :cond_3c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1389
    .line 1390
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    const/4 v1, 0x0

    .line 1418
    new-array v1, v1, [Ljava/lang/Object;

    .line 1419
    .line 1420
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    throw v0

    .line 1425
    :cond_3d
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v0

    .line 1429
    if-eqz v0, :cond_3e

    .line 1430
    .line 1431
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    invoke-static {v0}, Lg5/a0$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1440
    .line 1441
    .line 1442
    new-instance v0, Lg5/x$b;

    .line 1443
    .line 1444
    invoke-direct {v0, v1, v3}, Lg5/x$b;-><init>(Ljava/lang/String;Z)V

    .line 1445
    .line 1446
    .line 1447
    new-instance v1, Lg5/w;

    .line 1448
    .line 1449
    invoke-direct {v1, v0}, Lg5/w;-><init>(Lg5/x;)V

    .line 1450
    .line 1451
    .line 1452
    goto/16 :goto_d

    .line 1453
    .line 1454
    :cond_3e
    invoke-virtual {v8, v13, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1455
    .line 1456
    .line 1457
    new-instance v0, Lg5/x$b;

    .line 1458
    .line 1459
    invoke-direct {v0, v1, v3}, Lg5/x$b;-><init>(Ljava/lang/String;Z)V

    .line 1460
    .line 1461
    .line 1462
    goto :goto_e

    .line 1463
    :cond_3f
    const-string v0, "@Field parameters can only be used with form encoding."

    .line 1464
    .line 1465
    const/4 v1, 0x0

    .line 1466
    new-array v1, v1, [Ljava/lang/Object;

    .line 1467
    .line 1468
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v0

    .line 1472
    throw v0

    .line 1473
    :cond_40
    instance-of v6, v4, Li5/d;

    .line 1474
    .line 1475
    if-eqz v6, :cond_45

    .line 1476
    .line 1477
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1478
    .line 1479
    .line 1480
    iget-boolean v0, v15, Lg5/a0$a;->p:Z

    .line 1481
    .line 1482
    if-eqz v0, :cond_44

    .line 1483
    .line 1484
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v3

    .line 1492
    if-eqz v3, :cond_43

    .line 1493
    .line 1494
    invoke-static {v13, v0}, Lg5/h0;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v0

    .line 1498
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 1499
    .line 1500
    if-eqz v3, :cond_42

    .line 1501
    .line 1502
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1503
    .line 1504
    const/4 v3, 0x0

    .line 1505
    invoke-static {v3, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v3

    .line 1509
    if-ne v1, v3, :cond_41

    .line 1510
    .line 1511
    const/4 v1, 0x1

    .line 1512
    invoke-static {v1, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-virtual {v8, v0, v14}, Lg5/d0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1517
    .line 1518
    .line 1519
    iput-boolean v1, v15, Lg5/a0$a;->f:Z

    .line 1520
    .line 1521
    new-instance v0, Lg5/x$c;

    .line 1522
    .line 1523
    check-cast v4, Li5/d;

    .line 1524
    .line 1525
    invoke-interface {v4}, Li5/d;->encoded()Z

    .line 1526
    .line 1527
    .line 1528
    move-result v1

    .line 1529
    invoke-direct {v0, v9, v5, v1}, Lg5/x$c;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 1530
    .line 1531
    .line 1532
    :goto_e
    move-object v1, v0

    .line 1533
    goto/16 :goto_f

    .line 1534
    .line 1535
    :cond_41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1536
    .line 1537
    const-string v1, "@FieldMap keys must be of type String: "

    .line 1538
    .line 1539
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    const/4 v1, 0x0

    .line 1550
    new-array v1, v1, [Ljava/lang/Object;

    .line 1551
    .line 1552
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    throw v0

    .line 1557
    :cond_42
    const/4 v0, 0x0

    .line 1558
    new-array v0, v0, [Ljava/lang/Object;

    .line 1559
    .line 1560
    invoke-static {v9, v5, v7, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    throw v0

    .line 1565
    :cond_43
    const/4 v0, 0x0

    .line 1566
    const-string v1, "@FieldMap parameter type must be Map."

    .line 1567
    .line 1568
    new-array v0, v0, [Ljava/lang/Object;

    .line 1569
    .line 1570
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    throw v0

    .line 1575
    :cond_44
    const/4 v0, 0x0

    .line 1576
    const-string v1, "@FieldMap parameters can only be used with form encoding."

    .line 1577
    .line 1578
    new-array v0, v0, [Ljava/lang/Object;

    .line 1579
    .line 1580
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    throw v0

    .line 1585
    :cond_45
    instance-of v6, v4, Li5/q;

    .line 1586
    .line 1587
    move-object/from16 v25, v7

    .line 1588
    .line 1589
    iget-object v7, v15, Lg5/a0$a;->c:[Ljava/lang/annotation/Annotation;

    .line 1590
    .line 1591
    move-object/from16 v26, v1

    .line 1592
    .line 1593
    const-class v1, Lv4/t$b;

    .line 1594
    .line 1595
    if-eqz v6, :cond_54

    .line 1596
    .line 1597
    invoke-virtual {v11, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1598
    .line 1599
    .line 1600
    iget-boolean v3, v15, Lg5/a0$a;->q:Z

    .line 1601
    .line 1602
    if-eqz v3, :cond_53

    .line 1603
    .line 1604
    check-cast v4, Li5/q;

    .line 1605
    .line 1606
    const/4 v3, 0x1

    .line 1607
    iput-boolean v3, v15, Lg5/a0$a;->g:Z

    .line 1608
    .line 1609
    invoke-interface {v4}, Li5/q;->value()Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v3

    .line 1613
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v6

    .line 1617
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 1618
    .line 1619
    .line 1620
    move-result v25

    .line 1621
    if-eqz v25, :cond_4c

    .line 1622
    .line 1623
    invoke-virtual {v12, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1624
    .line 1625
    .line 1626
    move-result v3

    .line 1627
    sget-object v4, Lg5/x$m;->a:Lg5/x$m;

    .line 1628
    .line 1629
    const-string v7, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    .line 1630
    .line 1631
    if-eqz v3, :cond_48

    .line 1632
    .line 1633
    instance-of v3, v13, Ljava/lang/reflect/ParameterizedType;

    .line 1634
    .line 1635
    if-eqz v3, :cond_47

    .line 1636
    .line 1637
    move-object v0, v13

    .line 1638
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1639
    .line 1640
    const/4 v3, 0x0

    .line 1641
    invoke-static {v3, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    invoke-static {v0}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v0

    .line 1653
    if-eqz v0, :cond_46

    .line 1654
    .line 1655
    new-instance v0, Lg5/v;

    .line 1656
    .line 1657
    invoke-direct {v0, v4}, Lg5/v;-><init>(Lg5/x;)V

    .line 1658
    .line 1659
    .line 1660
    goto/16 :goto_e

    .line 1661
    .line 1662
    :cond_46
    new-array v0, v3, [Ljava/lang/Object;

    .line 1663
    .line 1664
    invoke-static {v9, v5, v7, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    throw v0

    .line 1669
    :cond_47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1670
    .line 1671
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v2

    .line 1678
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v0

    .line 1688
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    const/4 v1, 0x0

    .line 1699
    new-array v1, v1, [Ljava/lang/Object;

    .line 1700
    .line 1701
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    throw v0

    .line 1706
    :cond_48
    const/4 v0, 0x0

    .line 1707
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    if-eqz v3, :cond_4a

    .line 1712
    .line 1713
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v3

    .line 1717
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v1

    .line 1721
    if-eqz v1, :cond_49

    .line 1722
    .line 1723
    new-instance v0, Lg5/w;

    .line 1724
    .line 1725
    invoke-direct {v0, v4}, Lg5/w;-><init>(Lg5/x;)V

    .line 1726
    .line 1727
    .line 1728
    goto/16 :goto_e

    .line 1729
    .line 1730
    :cond_49
    new-array v0, v0, [Ljava/lang/Object;

    .line 1731
    .line 1732
    invoke-static {v9, v5, v7, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v0

    .line 1736
    throw v0

    .line 1737
    :cond_4a
    invoke-virtual {v1, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1738
    .line 1739
    .line 1740
    move-result v1

    .line 1741
    if-eqz v1, :cond_4b

    .line 1742
    .line 1743
    move-object v1, v4

    .line 1744
    :goto_f
    move-object v0, v2

    .line 1745
    goto/16 :goto_16

    .line 1746
    .line 1747
    :cond_4b
    new-array v0, v0, [Ljava/lang/Object;

    .line 1748
    .line 1749
    invoke-static {v9, v5, v7, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    throw v0

    .line 1754
    :cond_4c
    const/4 v11, 0x0

    .line 1755
    const/4 v15, 0x4

    .line 1756
    new-array v15, v15, [Ljava/lang/String;

    .line 1757
    .line 1758
    const-string v25, "Content-Disposition"

    .line 1759
    .line 1760
    aput-object v25, v15, v11

    .line 1761
    .line 1762
    const-string v11, "form-data; name=\""

    .line 1763
    .line 1764
    move-object/from16 v27, v2

    .line 1765
    .line 1766
    const-string v2, "\""

    .line 1767
    .line 1768
    invoke-static {v11, v3, v2}, Lb5/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v2

    .line 1772
    const/4 v3, 0x1

    .line 1773
    aput-object v2, v15, v3

    .line 1774
    .line 1775
    const-string v2, "Content-Transfer-Encoding"

    .line 1776
    .line 1777
    const/4 v3, 0x2

    .line 1778
    aput-object v2, v15, v3

    .line 1779
    .line 1780
    const/4 v2, 0x3

    .line 1781
    invoke-interface {v4}, Li5/q;->encoding()Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v3

    .line 1785
    aput-object v3, v15, v2

    .line 1786
    .line 1787
    invoke-static {v15}, Lv4/p;->f([Ljava/lang/String;)Lv4/p;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v2

    .line 1791
    invoke-virtual {v12, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1792
    .line 1793
    .line 1794
    move-result v3

    .line 1795
    const-string v4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    .line 1796
    .line 1797
    if-eqz v3, :cond_4f

    .line 1798
    .line 1799
    instance-of v3, v13, Ljava/lang/reflect/ParameterizedType;

    .line 1800
    .line 1801
    if-eqz v3, :cond_4e

    .line 1802
    .line 1803
    move-object v0, v13

    .line 1804
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 1805
    .line 1806
    const/4 v3, 0x0

    .line 1807
    invoke-static {v3, v0}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    invoke-static {v0}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v6

    .line 1815
    invoke-virtual {v1, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1816
    .line 1817
    .line 1818
    move-result v1

    .line 1819
    if-nez v1, :cond_4d

    .line 1820
    .line 1821
    invoke-virtual {v8, v0, v14, v7}, Lg5/d0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg5/f;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    new-instance v1, Lg5/x$g;

    .line 1826
    .line 1827
    invoke-direct {v1, v9, v5, v2, v0}, Lg5/x$g;-><init>(Ljava/lang/reflect/Method;ILv4/p;Lg5/f;)V

    .line 1828
    .line 1829
    .line 1830
    new-instance v0, Lg5/v;

    .line 1831
    .line 1832
    invoke-direct {v0, v1}, Lg5/v;-><init>(Lg5/x;)V

    .line 1833
    .line 1834
    .line 1835
    goto :goto_10

    .line 1836
    :cond_4d
    new-array v0, v3, [Ljava/lang/Object;

    .line 1837
    .line 1838
    invoke-static {v9, v5, v4, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v0

    .line 1842
    throw v0

    .line 1843
    :cond_4e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1844
    .line 1845
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v2

    .line 1852
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v0

    .line 1862
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1866
    .line 1867
    .line 1868
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v0

    .line 1872
    const/4 v1, 0x0

    .line 1873
    new-array v1, v1, [Ljava/lang/Object;

    .line 1874
    .line 1875
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v0

    .line 1879
    throw v0

    .line 1880
    :cond_4f
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 1881
    .line 1882
    .line 1883
    move-result v0

    .line 1884
    if-eqz v0, :cond_51

    .line 1885
    .line 1886
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v0

    .line 1890
    invoke-static {v0}, Lg5/a0$a;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v0

    .line 1894
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1895
    .line 1896
    .line 1897
    move-result v1

    .line 1898
    if-nez v1, :cond_50

    .line 1899
    .line 1900
    invoke-virtual {v8, v0, v14, v7}, Lg5/d0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg5/f;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v0

    .line 1904
    new-instance v1, Lg5/x$g;

    .line 1905
    .line 1906
    invoke-direct {v1, v9, v5, v2, v0}, Lg5/x$g;-><init>(Ljava/lang/reflect/Method;ILv4/p;Lg5/f;)V

    .line 1907
    .line 1908
    .line 1909
    new-instance v0, Lg5/w;

    .line 1910
    .line 1911
    invoke-direct {v0, v1}, Lg5/w;-><init>(Lg5/x;)V

    .line 1912
    .line 1913
    .line 1914
    :goto_10
    move-object v1, v0

    .line 1915
    :goto_11
    move-object/from16 v0, v27

    .line 1916
    .line 1917
    goto/16 :goto_15

    .line 1918
    .line 1919
    :cond_50
    const/4 v0, 0x0

    .line 1920
    new-array v0, v0, [Ljava/lang/Object;

    .line 1921
    .line 1922
    invoke-static {v9, v5, v4, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v0

    .line 1926
    throw v0

    .line 1927
    :cond_51
    const/4 v0, 0x0

    .line 1928
    invoke-virtual {v1, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1929
    .line 1930
    .line 1931
    move-result v1

    .line 1932
    if-nez v1, :cond_52

    .line 1933
    .line 1934
    invoke-virtual {v8, v13, v14, v7}, Lg5/d0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg5/f;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v0

    .line 1938
    new-instance v1, Lg5/x$g;

    .line 1939
    .line 1940
    invoke-direct {v1, v9, v5, v2, v0}, Lg5/x$g;-><init>(Ljava/lang/reflect/Method;ILv4/p;Lg5/f;)V

    .line 1941
    .line 1942
    .line 1943
    goto :goto_11

    .line 1944
    :cond_52
    new-array v0, v0, [Ljava/lang/Object;

    .line 1945
    .line 1946
    invoke-static {v9, v5, v4, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v0

    .line 1950
    throw v0

    .line 1951
    :cond_53
    const/4 v0, 0x0

    .line 1952
    const-string v1, "@Part parameters can only be used with multipart encoding."

    .line 1953
    .line 1954
    new-array v0, v0, [Ljava/lang/Object;

    .line 1955
    .line 1956
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v0

    .line 1960
    throw v0

    .line 1961
    :cond_54
    move-object/from16 v27, v2

    .line 1962
    .line 1963
    instance-of v0, v4, Li5/r;

    .line 1964
    .line 1965
    if-eqz v0, :cond_5a

    .line 1966
    .line 1967
    move-object/from16 v0, v27

    .line 1968
    .line 1969
    invoke-virtual {v0, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 1970
    .line 1971
    .line 1972
    iget-boolean v2, v0, Lg5/a0$a;->q:Z

    .line 1973
    .line 1974
    if-eqz v2, :cond_59

    .line 1975
    .line 1976
    const/4 v2, 0x1

    .line 1977
    iput-boolean v2, v0, Lg5/a0$a;->g:Z

    .line 1978
    .line 1979
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v6

    .line 1983
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1984
    .line 1985
    .line 1986
    move-result v3

    .line 1987
    if-eqz v3, :cond_58

    .line 1988
    .line 1989
    invoke-static {v13, v6}, Lg5/h0;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v3

    .line 1993
    instance-of v6, v3, Ljava/lang/reflect/ParameterizedType;

    .line 1994
    .line 1995
    if-eqz v6, :cond_57

    .line 1996
    .line 1997
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 1998
    .line 1999
    const/4 v6, 0x0

    .line 2000
    invoke-static {v6, v3}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v6

    .line 2004
    move-object/from16 v10, v26

    .line 2005
    .line 2006
    if-ne v10, v6, :cond_56

    .line 2007
    .line 2008
    invoke-static {v2, v3}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v2

    .line 2012
    invoke-static {v2}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v3

    .line 2016
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2017
    .line 2018
    .line 2019
    move-result v1

    .line 2020
    if-nez v1, :cond_55

    .line 2021
    .line 2022
    invoke-virtual {v8, v2, v14, v7}, Lg5/d0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg5/f;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v1

    .line 2026
    check-cast v4, Li5/r;

    .line 2027
    .line 2028
    new-instance v2, Lg5/x$h;

    .line 2029
    .line 2030
    invoke-interface {v4}, Li5/r;->encoding()Ljava/lang/String;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v3

    .line 2034
    invoke-direct {v2, v9, v5, v1, v3}, Lg5/x$h;-><init>(Ljava/lang/reflect/Method;ILg5/f;Ljava/lang/String;)V

    .line 2035
    .line 2036
    .line 2037
    goto/16 :goto_14

    .line 2038
    .line 2039
    :cond_55
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    .line 2040
    .line 2041
    const/4 v1, 0x0

    .line 2042
    new-array v1, v1, [Ljava/lang/Object;

    .line 2043
    .line 2044
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v0

    .line 2048
    throw v0

    .line 2049
    :cond_56
    const/4 v0, 0x0

    .line 2050
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2051
    .line 2052
    const-string v2, "@PartMap keys must be of type String: "

    .line 2053
    .line 2054
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2055
    .line 2056
    .line 2057
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2058
    .line 2059
    .line 2060
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    new-array v0, v0, [Ljava/lang/Object;

    .line 2065
    .line 2066
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    throw v0

    .line 2071
    :cond_57
    const/4 v0, 0x0

    .line 2072
    new-array v0, v0, [Ljava/lang/Object;

    .line 2073
    .line 2074
    move-object/from16 v1, v25

    .line 2075
    .line 2076
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    throw v0

    .line 2081
    :cond_58
    const/4 v0, 0x0

    .line 2082
    const-string v1, "@PartMap parameter type must be Map."

    .line 2083
    .line 2084
    new-array v0, v0, [Ljava/lang/Object;

    .line 2085
    .line 2086
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v0

    .line 2090
    throw v0

    .line 2091
    :cond_59
    const/4 v0, 0x0

    .line 2092
    const-string v1, "@PartMap parameters can only be used with multipart encoding."

    .line 2093
    .line 2094
    new-array v0, v0, [Ljava/lang/Object;

    .line 2095
    .line 2096
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    throw v0

    .line 2101
    :cond_5a
    move-object/from16 v0, v27

    .line 2102
    .line 2103
    instance-of v1, v4, Li5/a;

    .line 2104
    .line 2105
    if-eqz v1, :cond_5d

    .line 2106
    .line 2107
    invoke-virtual {v0, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 2108
    .line 2109
    .line 2110
    iget-boolean v1, v0, Lg5/a0$a;->p:Z

    .line 2111
    .line 2112
    if-nez v1, :cond_5c

    .line 2113
    .line 2114
    iget-boolean v1, v0, Lg5/a0$a;->q:Z

    .line 2115
    .line 2116
    if-nez v1, :cond_5c

    .line 2117
    .line 2118
    iget-boolean v1, v0, Lg5/a0$a;->h:Z

    .line 2119
    .line 2120
    if-nez v1, :cond_5b

    .line 2121
    .line 2122
    :try_start_1
    invoke-virtual {v8, v13, v14, v7}, Lg5/d0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lg5/f;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2126
    const/4 v2, 0x1

    .line 2127
    iput-boolean v2, v0, Lg5/a0$a;->h:Z

    .line 2128
    .line 2129
    new-instance v2, Lg5/x$a;

    .line 2130
    .line 2131
    invoke-direct {v2, v9, v5, v1}, Lg5/x$a;-><init>(Ljava/lang/reflect/Method;ILg5/f;)V

    .line 2132
    .line 2133
    .line 2134
    goto/16 :goto_14

    .line 2135
    .line 2136
    :catch_1
    move-exception v0

    .line 2137
    move-object v1, v0

    .line 2138
    const/4 v0, 0x1

    .line 2139
    new-array v0, v0, [Ljava/lang/Object;

    .line 2140
    .line 2141
    const/4 v2, 0x0

    .line 2142
    aput-object v13, v0, v2

    .line 2143
    .line 2144
    const-string v2, "Unable to create @Body converter for %s"

    .line 2145
    .line 2146
    invoke-static {v9, v1, v5, v2, v0}, Lg5/h0;->k(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v0

    .line 2150
    throw v0

    .line 2151
    :cond_5b
    const/4 v0, 0x0

    .line 2152
    const-string v1, "Multiple @Body method annotations found."

    .line 2153
    .line 2154
    new-array v0, v0, [Ljava/lang/Object;

    .line 2155
    .line 2156
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v0

    .line 2160
    throw v0

    .line 2161
    :cond_5c
    const/4 v0, 0x0

    .line 2162
    const-string v1, "@Body parameters cannot be used with form or multi-part encoding."

    .line 2163
    .line 2164
    new-array v0, v0, [Ljava/lang/Object;

    .line 2165
    .line 2166
    invoke-static {v9, v5, v1, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v0

    .line 2170
    throw v0

    .line 2171
    :cond_5d
    instance-of v1, v4, Li5/x;

    .line 2172
    .line 2173
    if-eqz v1, :cond_61

    .line 2174
    .line 2175
    invoke-virtual {v0, v5, v13}, Lg5/a0$a;->c(ILjava/lang/reflect/Type;)V

    .line 2176
    .line 2177
    .line 2178
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v1

    .line 2182
    add-int/lit8 v2, v5, -0x1

    .line 2183
    .line 2184
    :goto_12
    if-ltz v2, :cond_60

    .line 2185
    .line 2186
    iget-object v3, v0, Lg5/a0$a;->v:[Lg5/x;

    .line 2187
    .line 2188
    aget-object v3, v3, v2

    .line 2189
    .line 2190
    instance-of v4, v3, Lg5/x$o;

    .line 2191
    .line 2192
    if-eqz v4, :cond_5f

    .line 2193
    .line 2194
    check-cast v3, Lg5/x$o;

    .line 2195
    .line 2196
    iget-object v3, v3, Lg5/x$o;->a:Ljava/lang/Class;

    .line 2197
    .line 2198
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2199
    .line 2200
    .line 2201
    move-result v3

    .line 2202
    if-nez v3, :cond_5e

    .line 2203
    .line 2204
    goto :goto_13

    .line 2205
    :cond_5e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2206
    .line 2207
    const-string v3, "@Tag type "

    .line 2208
    .line 2209
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v1

    .line 2216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2217
    .line 2218
    .line 2219
    const-string v1, " is duplicate of parameter #"

    .line 2220
    .line 2221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2222
    .line 2223
    .line 2224
    add-int/lit8 v2, v2, 0x1

    .line 2225
    .line 2226
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2227
    .line 2228
    .line 2229
    const-string v1, " and would always overwrite its value."

    .line 2230
    .line 2231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2232
    .line 2233
    .line 2234
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v0

    .line 2238
    const/4 v1, 0x0

    .line 2239
    new-array v1, v1, [Ljava/lang/Object;

    .line 2240
    .line 2241
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v0

    .line 2245
    throw v0

    .line 2246
    :cond_5f
    :goto_13
    add-int/lit8 v2, v2, -0x1

    .line 2247
    .line 2248
    goto :goto_12

    .line 2249
    :cond_60
    new-instance v2, Lg5/x$o;

    .line 2250
    .line 2251
    invoke-direct {v2, v1}, Lg5/x$o;-><init>(Ljava/lang/Class;)V

    .line 2252
    .line 2253
    .line 2254
    :goto_14
    move-object v1, v2

    .line 2255
    goto :goto_15

    .line 2256
    :cond_61
    const/4 v1, 0x0

    .line 2257
    :goto_15
    move-object v11, v0

    .line 2258
    move-object v15, v11

    .line 2259
    :goto_16
    if-nez v1, :cond_62

    .line 2260
    .line 2261
    goto :goto_17

    .line 2262
    :cond_62
    if-nez v17, :cond_63

    .line 2263
    .line 2264
    move-object/from16 v17, v1

    .line 2265
    .line 2266
    :goto_17
    add-int/lit8 v3, v24, 0x1

    .line 2267
    .line 2268
    move-object/from16 v1, p1

    .line 2269
    .line 2270
    move-object v2, v0

    .line 2271
    move/from16 v4, v18

    .line 2272
    .line 2273
    move/from16 v6, v19

    .line 2274
    .line 2275
    move/from16 v10, v20

    .line 2276
    .line 2277
    move-object/from16 v8, v21

    .line 2278
    .line 2279
    move-object/from16 v12, v22

    .line 2280
    .line 2281
    move/from16 v7, v23

    .line 2282
    .line 2283
    move-object/from16 v0, p0

    .line 2284
    .line 2285
    goto/16 :goto_8

    .line 2286
    .line 2287
    :cond_63
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    .line 2288
    .line 2289
    const/4 v1, 0x0

    .line 2290
    new-array v1, v1, [Ljava/lang/Object;

    .line 2291
    .line 2292
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v0

    .line 2296
    throw v0

    .line 2297
    :cond_64
    move-object v0, v2

    .line 2298
    move/from16 v18, v4

    .line 2299
    .line 2300
    move/from16 v19, v6

    .line 2301
    .line 2302
    move/from16 v23, v7

    .line 2303
    .line 2304
    move-object/from16 v21, v8

    .line 2305
    .line 2306
    move-object/from16 v22, v12

    .line 2307
    .line 2308
    move-object v1, v11

    .line 2309
    move-object v11, v15

    .line 2310
    goto :goto_18

    .line 2311
    :cond_65
    move-object v0, v2

    .line 2312
    move-object/from16 v16, v3

    .line 2313
    .line 2314
    move/from16 v18, v4

    .line 2315
    .line 2316
    move/from16 v19, v6

    .line 2317
    .line 2318
    move/from16 v23, v7

    .line 2319
    .line 2320
    move-object/from16 v21, v8

    .line 2321
    .line 2322
    move-object/from16 v22, v12

    .line 2323
    .line 2324
    const/16 v17, 0x0

    .line 2325
    .line 2326
    move-object v1, v11

    .line 2327
    :goto_18
    if-nez v17, :cond_67

    .line 2328
    .line 2329
    if-eqz v23, :cond_66

    .line 2330
    .line 2331
    :try_start_2
    invoke-static {v13}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v2

    .line 2335
    const-class v3, Le4/d;

    .line 2336
    .line 2337
    if-ne v2, v3, :cond_66

    .line 2338
    .line 2339
    const/4 v2, 0x1

    .line 2340
    iput-boolean v2, v11, Lg5/a0$a;->w:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    .line 2341
    .line 2342
    const/16 v17, 0x0

    .line 2343
    .line 2344
    goto :goto_19

    .line 2345
    :catch_2
    :cond_66
    const-string v0, "No Retrofit annotation found."

    .line 2346
    .line 2347
    const/4 v1, 0x0

    .line 2348
    new-array v1, v1, [Ljava/lang/Object;

    .line 2349
    .line 2350
    invoke-static {v9, v5, v0, v1}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v0

    .line 2354
    throw v0

    .line 2355
    :cond_67
    :goto_19
    aput-object v17, v22, v5

    .line 2356
    .line 2357
    add-int/lit8 v5, v5, 0x1

    .line 2358
    .line 2359
    const/4 v7, 0x0

    .line 2360
    const/4 v10, 0x1

    .line 2361
    move-object v2, v0

    .line 2362
    move-object v11, v1

    .line 2363
    move-object/from16 v3, v16

    .line 2364
    .line 2365
    move/from16 v4, v18

    .line 2366
    .line 2367
    move/from16 v6, v19

    .line 2368
    .line 2369
    move-object/from16 v8, v21

    .line 2370
    .line 2371
    move-object/from16 v0, p0

    .line 2372
    .line 2373
    move-object/from16 v1, p1

    .line 2374
    .line 2375
    goto/16 :goto_7

    .line 2376
    .line 2377
    :cond_68
    move-object/from16 v21, v8

    .line 2378
    .line 2379
    iget-object v0, v11, Lg5/a0$a;->r:Ljava/lang/String;

    .line 2380
    .line 2381
    if-nez v0, :cond_6a

    .line 2382
    .line 2383
    iget-boolean v0, v11, Lg5/a0$a;->m:Z

    .line 2384
    .line 2385
    if-eqz v0, :cond_69

    .line 2386
    .line 2387
    goto :goto_1a

    .line 2388
    :cond_69
    const/4 v0, 0x1

    .line 2389
    new-array v0, v0, [Ljava/lang/Object;

    .line 2390
    .line 2391
    iget-object v1, v11, Lg5/a0$a;->n:Ljava/lang/String;

    .line 2392
    .line 2393
    const/4 v2, 0x0

    .line 2394
    aput-object v1, v0, v2

    .line 2395
    .line 2396
    const-string v1, "Missing either @%s URL or @Url parameter."

    .line 2397
    .line 2398
    const/4 v2, 0x0

    .line 2399
    invoke-static {v9, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v0

    .line 2403
    throw v0

    .line 2404
    :cond_6a
    :goto_1a
    iget-boolean v0, v11, Lg5/a0$a;->p:Z

    .line 2405
    .line 2406
    if-nez v0, :cond_6c

    .line 2407
    .line 2408
    iget-boolean v1, v11, Lg5/a0$a;->q:Z

    .line 2409
    .line 2410
    if-nez v1, :cond_6c

    .line 2411
    .line 2412
    iget-boolean v1, v11, Lg5/a0$a;->o:Z

    .line 2413
    .line 2414
    if-nez v1, :cond_6c

    .line 2415
    .line 2416
    iget-boolean v1, v11, Lg5/a0$a;->h:Z

    .line 2417
    .line 2418
    if-nez v1, :cond_6b

    .line 2419
    .line 2420
    goto :goto_1b

    .line 2421
    :cond_6b
    const/4 v0, 0x0

    .line 2422
    new-array v0, v0, [Ljava/lang/Object;

    .line 2423
    .line 2424
    const-string v1, "Non-body HTTP method cannot contain @Body."

    .line 2425
    .line 2426
    const/4 v2, 0x0

    .line 2427
    invoke-static {v9, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v0

    .line 2431
    throw v0

    .line 2432
    :cond_6c
    :goto_1b
    const/4 v1, 0x0

    .line 2433
    const/4 v2, 0x0

    .line 2434
    if-eqz v0, :cond_6e

    .line 2435
    .line 2436
    iget-boolean v0, v11, Lg5/a0$a;->f:Z

    .line 2437
    .line 2438
    if-eqz v0, :cond_6d

    .line 2439
    .line 2440
    goto :goto_1c

    .line 2441
    :cond_6d
    new-array v0, v1, [Ljava/lang/Object;

    .line 2442
    .line 2443
    const-string v1, "Form-encoded method must contain at least one @Field."

    .line 2444
    .line 2445
    invoke-static {v9, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v0

    .line 2449
    throw v0

    .line 2450
    :cond_6e
    :goto_1c
    iget-boolean v0, v11, Lg5/a0$a;->q:Z

    .line 2451
    .line 2452
    if-eqz v0, :cond_70

    .line 2453
    .line 2454
    iget-boolean v0, v11, Lg5/a0$a;->g:Z

    .line 2455
    .line 2456
    if-eqz v0, :cond_6f

    .line 2457
    .line 2458
    goto :goto_1d

    .line 2459
    :cond_6f
    new-array v0, v1, [Ljava/lang/Object;

    .line 2460
    .line 2461
    const-string v1, "Multipart method must contain at least one @Part."

    .line 2462
    .line 2463
    invoke-static {v9, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v0

    .line 2467
    throw v0

    .line 2468
    :cond_70
    :goto_1d
    new-instance v0, Lg5/a0;

    .line 2469
    .line 2470
    invoke-direct {v0, v11}, Lg5/a0;-><init>(Lg5/a0$a;)V

    .line 2471
    .line 2472
    .line 2473
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v1

    .line 2477
    invoke-static {v1}, Lg5/h0;->g(Ljava/lang/reflect/Type;)Z

    .line 2478
    .line 2479
    .line 2480
    move-result v2

    .line 2481
    if-nez v2, :cond_7c

    .line 2482
    .line 2483
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2484
    .line 2485
    if-eq v1, v2, :cond_7b

    .line 2486
    .line 2487
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v1

    .line 2491
    iget-boolean v2, v0, Lg5/a0;->k:Z

    .line 2492
    .line 2493
    const-class v3, Lg5/b0;

    .line 2494
    .line 2495
    if-eqz v2, :cond_74

    .line 2496
    .line 2497
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2498
    .line 2499
    .line 2500
    move-result-object v4

    .line 2501
    array-length v5, v4

    .line 2502
    add-int/lit8 v5, v5, -0x1

    .line 2503
    .line 2504
    aget-object v4, v4, v5

    .line 2505
    .line 2506
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 2507
    .line 2508
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v4

    .line 2512
    const/4 v5, 0x0

    .line 2513
    aget-object v4, v4, v5

    .line 2514
    .line 2515
    instance-of v6, v4, Ljava/lang/reflect/WildcardType;

    .line 2516
    .line 2517
    if-eqz v6, :cond_71

    .line 2518
    .line 2519
    check-cast v4, Ljava/lang/reflect/WildcardType;

    .line 2520
    .line 2521
    invoke-interface {v4}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v4

    .line 2525
    aget-object v4, v4, v5

    .line 2526
    .line 2527
    :cond_71
    invoke-static {v4}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v6

    .line 2531
    if-ne v6, v3, :cond_72

    .line 2532
    .line 2533
    instance-of v6, v4, Ljava/lang/reflect/ParameterizedType;

    .line 2534
    .line 2535
    if-eqz v6, :cond_72

    .line 2536
    .line 2537
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 2538
    .line 2539
    invoke-static {v5, v4}, Lg5/h0;->d(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2540
    .line 2541
    .line 2542
    move-result-object v4

    .line 2543
    const/4 v6, 0x1

    .line 2544
    goto :goto_1e

    .line 2545
    :cond_72
    move v6, v5

    .line 2546
    :goto_1e
    new-instance v7, Lg5/h0$b;

    .line 2547
    .line 2548
    const/4 v8, 0x1

    .line 2549
    new-array v9, v8, [Ljava/lang/reflect/Type;

    .line 2550
    .line 2551
    aput-object v4, v9, v5

    .line 2552
    .line 2553
    const-class v4, Lg5/b;

    .line 2554
    .line 2555
    const/4 v10, 0x0

    .line 2556
    invoke-direct {v7, v10, v4, v9}, Lg5/h0$b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 2557
    .line 2558
    .line 2559
    const-class v4, Lg5/f0;

    .line 2560
    .line 2561
    invoke-static {v1, v4}, Lg5/h0;->h([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 2562
    .line 2563
    .line 2564
    move-result v4

    .line 2565
    if-eqz v4, :cond_73

    .line 2566
    .line 2567
    goto :goto_1f

    .line 2568
    :cond_73
    array-length v4, v1

    .line 2569
    add-int/2addr v4, v8

    .line 2570
    new-array v4, v4, [Ljava/lang/annotation/Annotation;

    .line 2571
    .line 2572
    sget-object v9, Lg5/g0;->a:Lg5/g0;

    .line 2573
    .line 2574
    aput-object v9, v4, v5

    .line 2575
    .line 2576
    array-length v9, v1

    .line 2577
    invoke-static {v1, v5, v4, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2578
    .line 2579
    .line 2580
    move-object v1, v4

    .line 2581
    goto :goto_1f

    .line 2582
    :cond_74
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v7

    .line 2586
    const/4 v6, 0x0

    .line 2587
    :goto_1f
    move-object/from16 v4, p0

    .line 2588
    .line 2589
    :try_start_3
    invoke-virtual {v4, v7, v1}, Lg5/d0;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg5/c;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 2593
    invoke-interface {v1}, Lg5/c;->a()Ljava/lang/reflect/Type;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v5

    .line 2597
    const-class v7, Lv4/b0;

    .line 2598
    .line 2599
    if-eq v5, v7, :cond_7a

    .line 2600
    .line 2601
    if-eq v5, v3, :cond_79

    .line 2602
    .line 2603
    iget-object v3, v0, Lg5/a0;->c:Ljava/lang/String;

    .line 2604
    .line 2605
    move-object/from16 v7, v21

    .line 2606
    .line 2607
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2608
    .line 2609
    .line 2610
    move-result v3

    .line 2611
    if-eqz v3, :cond_76

    .line 2612
    .line 2613
    const-class v3, Ljava/lang/Void;

    .line 2614
    .line 2615
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2616
    .line 2617
    .line 2618
    move-result v3

    .line 2619
    if-eqz v3, :cond_75

    .line 2620
    .line 2621
    goto :goto_20

    .line 2622
    :cond_75
    const/4 v0, 0x0

    .line 2623
    new-array v0, v0, [Ljava/lang/Object;

    .line 2624
    .line 2625
    const-string v1, "HEAD method must use Void as response type."

    .line 2626
    .line 2627
    const/4 v2, 0x0

    .line 2628
    move-object/from16 v3, p1

    .line 2629
    .line 2630
    invoke-static {v3, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v0

    .line 2634
    throw v0

    .line 2635
    :cond_76
    :goto_20
    move-object/from16 v3, p1

    .line 2636
    .line 2637
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v7

    .line 2641
    :try_start_4
    invoke-virtual {v4, v5, v7}, Lg5/d0;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lg5/f;

    .line 2642
    .line 2643
    .line 2644
    move-result-object v3
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 2645
    iget-object v4, v4, Lg5/d0;->b:Lv4/d$a;

    .line 2646
    .line 2647
    if-nez v2, :cond_77

    .line 2648
    .line 2649
    new-instance v2, Lg5/k$a;

    .line 2650
    .line 2651
    invoke-direct {v2, v0, v4, v3, v1}, Lg5/k$a;-><init>(Lg5/a0;Lv4/d$a;Lg5/f;Lg5/c;)V

    .line 2652
    .line 2653
    .line 2654
    goto :goto_21

    .line 2655
    :cond_77
    if-eqz v6, :cond_78

    .line 2656
    .line 2657
    new-instance v2, Lg5/k$c;

    .line 2658
    .line 2659
    invoke-direct {v2, v0, v4, v3, v1}, Lg5/k$c;-><init>(Lg5/a0;Lv4/d$a;Lg5/f;Lg5/c;)V

    .line 2660
    .line 2661
    .line 2662
    goto :goto_21

    .line 2663
    :cond_78
    new-instance v2, Lg5/k$b;

    .line 2664
    .line 2665
    invoke-direct {v2, v0, v4, v3, v1}, Lg5/k$b;-><init>(Lg5/a0;Lv4/d$a;Lg5/f;Lg5/c;)V

    .line 2666
    .line 2667
    .line 2668
    :goto_21
    return-object v2

    .line 2669
    :catch_3
    move-exception v0

    .line 2670
    move-object v1, v0

    .line 2671
    const/4 v0, 0x1

    .line 2672
    new-array v0, v0, [Ljava/lang/Object;

    .line 2673
    .line 2674
    const/4 v2, 0x0

    .line 2675
    aput-object v5, v0, v2

    .line 2676
    .line 2677
    const-string v2, "Unable to create converter for %s"

    .line 2678
    .line 2679
    invoke-static {v3, v1, v2, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2680
    .line 2681
    .line 2682
    move-result-object v0

    .line 2683
    throw v0

    .line 2684
    :cond_79
    move-object/from16 v3, p1

    .line 2685
    .line 2686
    const/4 v0, 0x0

    .line 2687
    new-array v0, v0, [Ljava/lang/Object;

    .line 2688
    .line 2689
    const-string v1, "Response must include generic type (e.g., Response<String>)"

    .line 2690
    .line 2691
    const/4 v2, 0x0

    .line 2692
    invoke-static {v3, v2, v1, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v0

    .line 2696
    throw v0

    .line 2697
    :cond_7a
    move-object/from16 v3, p1

    .line 2698
    .line 2699
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2700
    .line 2701
    const-string v1, "\'"

    .line 2702
    .line 2703
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2704
    .line 2705
    .line 2706
    invoke-static {v5}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v1

    .line 2710
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v1

    .line 2714
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2715
    .line 2716
    .line 2717
    const-string v1, "\' is not a valid response body type. Did you mean ResponseBody?"

    .line 2718
    .line 2719
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2720
    .line 2721
    .line 2722
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v0

    .line 2726
    const/4 v1, 0x0

    .line 2727
    new-array v1, v1, [Ljava/lang/Object;

    .line 2728
    .line 2729
    const/4 v2, 0x0

    .line 2730
    invoke-static {v3, v2, v0, v1}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2731
    .line 2732
    .line 2733
    move-result-object v0

    .line 2734
    throw v0

    .line 2735
    :catch_4
    move-exception v0

    .line 2736
    move-object/from16 v3, p1

    .line 2737
    .line 2738
    move-object v1, v0

    .line 2739
    const/4 v0, 0x0

    .line 2740
    const/4 v2, 0x1

    .line 2741
    new-array v2, v2, [Ljava/lang/Object;

    .line 2742
    .line 2743
    aput-object v7, v2, v0

    .line 2744
    .line 2745
    const-string v0, "Unable to create call adapter for %s"

    .line 2746
    .line 2747
    invoke-static {v3, v1, v0, v2}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2748
    .line 2749
    .line 2750
    move-result-object v0

    .line 2751
    throw v0

    .line 2752
    :cond_7b
    move-object/from16 v3, p1

    .line 2753
    .line 2754
    const/4 v0, 0x0

    .line 2755
    const/4 v1, 0x0

    .line 2756
    new-array v0, v0, [Ljava/lang/Object;

    .line 2757
    .line 2758
    const-string v2, "Service methods cannot return void."

    .line 2759
    .line 2760
    invoke-static {v3, v1, v2, v0}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2761
    .line 2762
    .line 2763
    move-result-object v0

    .line 2764
    throw v0

    .line 2765
    :cond_7c
    move-object/from16 v3, p1

    .line 2766
    .line 2767
    const/4 v0, 0x0

    .line 2768
    const/4 v2, 0x0

    .line 2769
    const/4 v4, 0x1

    .line 2770
    new-array v4, v4, [Ljava/lang/Object;

    .line 2771
    .line 2772
    aput-object v1, v4, v0

    .line 2773
    .line 2774
    const-string v0, "Method return type must not include a type variable or wildcard: %s"

    .line 2775
    .line 2776
    invoke-static {v3, v2, v0, v4}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v0

    .line 2780
    throw v0

    .line 2781
    :cond_7d
    const/4 v0, 0x0

    .line 2782
    new-array v1, v5, [Ljava/lang/Object;

    .line 2783
    .line 2784
    const-string v2, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    .line 2785
    .line 2786
    invoke-static {v9, v0, v2, v1}, Lg5/h0;->i(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2787
    .line 2788
    .line 2789
    move-result-object v0

    .line 2790
    throw v0
.end method


# virtual methods
.method public abstract a([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
