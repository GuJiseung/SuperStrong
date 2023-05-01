.class public final Lx/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/util/TypedValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lx/b;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1

    invoke-static {p0, p1, v0, p2}, Lx/b;->b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "selector"

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_2a

    .line 18
    .line 19
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x1

    .line 24
    add-int/2addr v3, v4

    .line 25
    const/16 v5, 0x14

    .line 26
    .line 27
    new-array v6, v5, [[I

    .line 28
    .line 29
    new-array v5, v5, [I

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    move v8, v7

    .line 33
    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    if-eq v9, v4, :cond_29

    .line 38
    .line 39
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    const/4 v11, 0x3

    .line 44
    if-ge v10, v3, :cond_0

    .line 45
    .line 46
    if-eq v9, v11, :cond_29

    .line 47
    .line 48
    :cond_0
    const/4 v12, 0x2

    .line 49
    if-ne v9, v12, :cond_28

    .line 50
    .line 51
    if-gt v10, v3, :cond_28

    .line 52
    .line 53
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    const-string v10, "item"

    .line 58
    .line 59
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-nez v9, :cond_1

    .line 64
    .line 65
    goto/16 :goto_1f

    .line 66
    .line 67
    :cond_1
    sget-object v9, Lc/b;->o0:[I

    .line 68
    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0, v1, v9}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {v2, v1, v9, v7, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    :goto_1
    const/4 v10, -0x1

    .line 81
    invoke-virtual {v9, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    const/16 v14, 0x1f

    .line 86
    .line 87
    if-eq v13, v10, :cond_5

    .line 88
    .line 89
    sget-object v15, Lx/b;->a:Ljava/lang/ThreadLocal;

    .line 90
    .line 91
    invoke-virtual {v15}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v16

    .line 95
    check-cast v16, Landroid/util/TypedValue;

    .line 96
    .line 97
    if-nez v16, :cond_3

    .line 98
    .line 99
    new-instance v10, Landroid/util/TypedValue;

    .line 100
    .line 101
    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v15, v10}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move-object/from16 v10, v16

    .line 109
    .line 110
    :goto_2
    invoke-virtual {v0, v13, v10, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 111
    .line 112
    .line 113
    iget v10, v10, Landroid/util/TypedValue;->type:I

    .line 114
    .line 115
    const/16 v15, 0x1c

    .line 116
    .line 117
    if-lt v10, v15, :cond_4

    .line 118
    .line 119
    if-gt v10, v14, :cond_4

    .line 120
    .line 121
    move v10, v4

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move v10, v7

    .line 124
    :goto_3
    if-nez v10, :cond_5

    .line 125
    .line 126
    :try_start_0
    invoke-virtual {v0, v13}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-static {v0, v10, v2}, Lx/b;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 135
    .line 136
    .line 137
    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    goto :goto_4

    .line 139
    :catch_0
    :cond_5
    const v10, -0xff01

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v7, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    :goto_4
    invoke-virtual {v9, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    const/high16 v15, 0x3f800000    # 1.0f

    .line 151
    .line 152
    if-eqz v13, :cond_6

    .line 153
    .line 154
    invoke-virtual {v9, v4, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    goto :goto_5

    .line 159
    :cond_6
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-eqz v13, :cond_7

    .line 164
    .line 165
    invoke-virtual {v9, v11, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    move v11, v15

    .line 171
    :goto_5
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 172
    .line 173
    if-lt v13, v14, :cond_8

    .line 174
    .line 175
    invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-eqz v13, :cond_8

    .line 180
    .line 181
    move v13, v12

    .line 182
    goto :goto_6

    .line 183
    :cond_8
    const/4 v13, 0x4

    .line 184
    :goto_6
    const/high16 v14, -0x40800000    # -1.0f

    .line 185
    .line 186
    invoke-virtual {v9, v13, v14}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 191
    .line 192
    .line 193
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    new-array v14, v9, [I

    .line 198
    .line 199
    move v4, v7

    .line 200
    move v12, v4

    .line 201
    :goto_7
    if-ge v4, v9, :cond_b

    .line 202
    .line 203
    invoke-interface {v1, v4}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    const v7, 0x10101a5

    .line 208
    .line 209
    .line 210
    if-eq v15, v7, :cond_a

    .line 211
    .line 212
    const v7, 0x101031f

    .line 213
    .line 214
    .line 215
    if-eq v15, v7, :cond_a

    .line 216
    .line 217
    const v7, 0x7f04002d

    .line 218
    .line 219
    .line 220
    if-eq v15, v7, :cond_a

    .line 221
    .line 222
    const v7, 0x7f04023d

    .line 223
    .line 224
    .line 225
    if-eq v15, v7, :cond_a

    .line 226
    .line 227
    add-int/lit8 v7, v12, 0x1

    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-interface {v1, v4, v0}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 231
    .line 232
    .line 233
    move-result v18

    .line 234
    if-eqz v18, :cond_9

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_9
    neg-int v15, v15

    .line 238
    :goto_8
    aput v15, v14, v12

    .line 239
    .line 240
    move v12, v7

    .line 241
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 242
    .line 243
    move-object/from16 v0, p0

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    const/high16 v15, 0x3f800000    # 1.0f

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_b
    invoke-static {v14, v12}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    const/4 v4, 0x0

    .line 254
    cmpl-float v7, v13, v4

    .line 255
    .line 256
    const/high16 v9, 0x42c80000    # 100.0f

    .line 257
    .line 258
    if-ltz v7, :cond_c

    .line 259
    .line 260
    cmpg-float v7, v13, v9

    .line 261
    .line 262
    if-gtz v7, :cond_c

    .line 263
    .line 264
    const/4 v7, 0x1

    .line 265
    goto :goto_9

    .line 266
    :cond_c
    const/4 v7, 0x0

    .line 267
    :goto_9
    const/high16 v12, 0x3f800000    # 1.0f

    .line 268
    .line 269
    cmpl-float v14, v11, v12

    .line 270
    .line 271
    if-nez v14, :cond_d

    .line 272
    .line 273
    if-nez v7, :cond_d

    .line 274
    .line 275
    move-object v7, v0

    .line 276
    move/from16 v21, v3

    .line 277
    .line 278
    const/4 v9, 0x1

    .line 279
    goto/16 :goto_1c

    .line 280
    .line 281
    :cond_d
    invoke-static {v10}, Landroid/graphics/Color;->alpha(I)I

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    int-to-float v12, v12

    .line 286
    mul-float/2addr v12, v11

    .line 287
    const/high16 v11, 0x3f000000    # 0.5f

    .line 288
    .line 289
    add-float/2addr v12, v11

    .line 290
    float-to-int v11, v12

    .line 291
    const/16 v12, 0xff

    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    invoke-static {v11, v14, v12}, Lc/a;->j(III)I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-eqz v7, :cond_23

    .line 299
    .line 300
    invoke-static {v10}, Lx/a;->a(I)Lx/a;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    sget-object v10, Lx/l;->k:Lx/l;

    .line 305
    .line 306
    iget v12, v7, Lx/a;->b:F

    .line 307
    .line 308
    float-to-double v14, v12

    .line 309
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 310
    .line 311
    cmpg-double v14, v14, v18

    .line 312
    .line 313
    const v18, 0x4461d2f7

    .line 314
    .line 315
    .line 316
    const/high16 v19, 0x42e80000    # 116.0f

    .line 317
    .line 318
    const/high16 v20, 0x41800000    # 16.0f

    .line 319
    .line 320
    if-ltz v14, :cond_1b

    .line 321
    .line 322
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    move-object/from16 v22, v10

    .line 327
    .line 328
    int-to-double v9, v14

    .line 329
    const-wide/16 v23, 0x0

    .line 330
    .line 331
    cmpg-double v9, v9, v23

    .line 332
    .line 333
    if-lez v9, :cond_1b

    .line 334
    .line 335
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    int-to-double v9, v9

    .line 340
    const-wide/high16 v23, 0x4059000000000000L    # 100.0

    .line 341
    .line 342
    cmpl-double v9, v9, v23

    .line 343
    .line 344
    if-ltz v9, :cond_e

    .line 345
    .line 346
    goto/16 :goto_13

    .line 347
    .line 348
    :cond_e
    iget v7, v7, Lx/a;->a:F

    .line 349
    .line 350
    cmpg-float v9, v7, v4

    .line 351
    .line 352
    if-gez v9, :cond_f

    .line 353
    .line 354
    move v7, v4

    .line 355
    goto :goto_a

    .line 356
    :cond_f
    const/high16 v9, 0x43b40000    # 360.0f

    .line 357
    .line 358
    invoke-static {v9, v7}, Ljava/lang/Math;->min(FF)F

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    :goto_a
    move/from16 v23, v4

    .line 363
    .line 364
    move v10, v12

    .line 365
    const/4 v9, 0x0

    .line 366
    const/4 v14, 0x1

    .line 367
    :goto_b
    sub-float v25, v23, v12

    .line 368
    .line 369
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->abs(F)F

    .line 370
    .line 371
    .line 372
    move-result v25

    .line 373
    const v26, 0x3ecccccd    # 0.4f

    .line 374
    .line 375
    .line 376
    cmpl-float v25, v25, v26

    .line 377
    .line 378
    if-ltz v25, :cond_19

    .line 379
    .line 380
    const/high16 v25, 0x447a0000    # 1000.0f

    .line 381
    .line 382
    move/from16 v27, v4

    .line 383
    .line 384
    move/from16 v26, v25

    .line 385
    .line 386
    const/high16 v28, 0x42c80000    # 100.0f

    .line 387
    .line 388
    const/16 v29, 0x0

    .line 389
    .line 390
    :goto_c
    sub-float v30, v27, v28

    .line 391
    .line 392
    invoke-static/range {v30 .. v30}, Ljava/lang/Math;->abs(F)F

    .line 393
    .line 394
    .line 395
    move-result v30

    .line 396
    const v31, 0x3c23d70a    # 0.01f

    .line 397
    .line 398
    .line 399
    cmpl-float v30, v30, v31

    .line 400
    .line 401
    const/high16 v31, 0x40000000    # 2.0f

    .line 402
    .line 403
    if-lez v30, :cond_15

    .line 404
    .line 405
    sub-float v30, v28, v27

    .line 406
    .line 407
    div-float v30, v30, v31

    .line 408
    .line 409
    add-float v4, v30, v27

    .line 410
    .line 411
    invoke-static {v4, v10, v7}, Lx/a;->b(FFF)Lx/a;

    .line 412
    .line 413
    .line 414
    move-result-object v15

    .line 415
    sget-object v1, Lx/l;->k:Lx/l;

    .line 416
    .line 417
    invoke-virtual {v15, v1}, Lx/a;->c(Lx/l;)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 422
    .line 423
    .line 424
    move-result v15

    .line 425
    invoke-static {v15}, Lc0/n;->h(I)F

    .line 426
    .line 427
    .line 428
    move-result v15

    .line 429
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 430
    .line 431
    .line 432
    move-result v32

    .line 433
    invoke-static/range {v32 .. v32}, Lc0/n;->h(I)F

    .line 434
    .line 435
    .line 436
    move-result v32

    .line 437
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 438
    .line 439
    .line 440
    move-result v33

    .line 441
    invoke-static/range {v33 .. v33}, Lc0/n;->h(I)F

    .line 442
    .line 443
    .line 444
    move-result v33

    .line 445
    sget-object v34, Lc0/n;->e:[[F

    .line 446
    .line 447
    const/16 v16, 0x1

    .line 448
    .line 449
    aget-object v34, v34, v16

    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    aget v35, v34, v17

    .line 454
    .line 455
    mul-float v15, v15, v35

    .line 456
    .line 457
    aget v35, v34, v16

    .line 458
    .line 459
    mul-float v32, v32, v35

    .line 460
    .line 461
    add-float v32, v32, v15

    .line 462
    .line 463
    const/4 v15, 0x2

    .line 464
    aget v34, v34, v15

    .line 465
    .line 466
    mul-float v33, v33, v34

    .line 467
    .line 468
    add-float v33, v33, v32

    .line 469
    .line 470
    const/high16 v15, 0x42c80000    # 100.0f

    .line 471
    .line 472
    div-float v2, v33, v15

    .line 473
    .line 474
    const v21, 0x3c111aa7

    .line 475
    .line 476
    .line 477
    cmpg-float v32, v2, v21

    .line 478
    .line 479
    if-gtz v32, :cond_10

    .line 480
    .line 481
    mul-float v2, v2, v18

    .line 482
    .line 483
    move/from16 v21, v3

    .line 484
    .line 485
    goto :goto_d

    .line 486
    :cond_10
    move/from16 v21, v3

    .line 487
    .line 488
    float-to-double v2, v2

    .line 489
    invoke-static {v2, v3}, Ljava/lang/Math;->cbrt(D)D

    .line 490
    .line 491
    .line 492
    move-result-wide v2

    .line 493
    double-to-float v2, v2

    .line 494
    mul-float v2, v2, v19

    .line 495
    .line 496
    sub-float v2, v2, v20

    .line 497
    .line 498
    :goto_d
    sub-float v3, v13, v2

    .line 499
    .line 500
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    const v32, 0x3e4ccccd    # 0.2f

    .line 505
    .line 506
    .line 507
    cmpg-float v32, v3, v32

    .line 508
    .line 509
    if-gez v32, :cond_11

    .line 510
    .line 511
    invoke-static {v1}, Lx/a;->a(I)Lx/a;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iget v15, v1, Lx/a;->c:F

    .line 516
    .line 517
    move/from16 v33, v3

    .line 518
    .line 519
    iget v3, v1, Lx/a;->b:F

    .line 520
    .line 521
    invoke-static {v15, v3, v7}, Lx/a;->b(FFF)Lx/a;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    iget v15, v3, Lx/a;->d:F

    .line 526
    .line 527
    move/from16 v34, v4

    .line 528
    .line 529
    iget v4, v1, Lx/a;->d:F

    .line 530
    .line 531
    sub-float/2addr v4, v15

    .line 532
    iget v15, v1, Lx/a;->e:F

    .line 533
    .line 534
    move/from16 v35, v7

    .line 535
    .line 536
    iget v7, v3, Lx/a;->e:F

    .line 537
    .line 538
    sub-float/2addr v15, v7

    .line 539
    iget v7, v1, Lx/a;->f:F

    .line 540
    .line 541
    iget v3, v3, Lx/a;->f:F

    .line 542
    .line 543
    sub-float/2addr v7, v3

    .line 544
    mul-float/2addr v4, v4

    .line 545
    mul-float/2addr v15, v15

    .line 546
    add-float/2addr v15, v4

    .line 547
    mul-float/2addr v7, v7

    .line 548
    add-float/2addr v7, v15

    .line 549
    float-to-double v3, v7

    .line 550
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 551
    .line 552
    .line 553
    move-result-wide v3

    .line 554
    move-object v7, v0

    .line 555
    move-object v15, v1

    .line 556
    const-wide v0, 0x3fe428f5c28f5c29L    # 0.63

    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 562
    .line 563
    .line 564
    move-result-wide v0

    .line 565
    const-wide v3, 0x3ff68f5c28f5c28fL    # 1.41

    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    mul-double/2addr v0, v3

    .line 571
    double-to-float v0, v0

    .line 572
    const/high16 v1, 0x3f800000    # 1.0f

    .line 573
    .line 574
    cmpg-float v3, v0, v1

    .line 575
    .line 576
    if-gtz v3, :cond_12

    .line 577
    .line 578
    move/from16 v26, v0

    .line 579
    .line 580
    move-object/from16 v29, v15

    .line 581
    .line 582
    move/from16 v25, v33

    .line 583
    .line 584
    goto :goto_e

    .line 585
    :cond_11
    move/from16 v34, v4

    .line 586
    .line 587
    move/from16 v35, v7

    .line 588
    .line 589
    move-object v7, v0

    .line 590
    :cond_12
    :goto_e
    const/4 v0, 0x0

    .line 591
    cmpl-float v1, v25, v0

    .line 592
    .line 593
    if-nez v1, :cond_13

    .line 594
    .line 595
    cmpl-float v1, v26, v0

    .line 596
    .line 597
    if-nez v1, :cond_13

    .line 598
    .line 599
    goto :goto_10

    .line 600
    :cond_13
    cmpg-float v1, v2, v13

    .line 601
    .line 602
    if-gez v1, :cond_14

    .line 603
    .line 604
    move/from16 v27, v34

    .line 605
    .line 606
    goto :goto_f

    .line 607
    :cond_14
    move/from16 v28, v34

    .line 608
    .line 609
    :goto_f
    move-object/from16 v1, p2

    .line 610
    .line 611
    move-object/from16 v2, p3

    .line 612
    .line 613
    move v4, v0

    .line 614
    move-object v0, v7

    .line 615
    move/from16 v3, v21

    .line 616
    .line 617
    move/from16 v7, v35

    .line 618
    .line 619
    goto/16 :goto_c

    .line 620
    .line 621
    :cond_15
    move/from16 v21, v3

    .line 622
    .line 623
    move/from16 v35, v7

    .line 624
    .line 625
    move-object v7, v0

    .line 626
    move v0, v4

    .line 627
    :goto_10
    move-object/from16 v1, v29

    .line 628
    .line 629
    if-eqz v14, :cond_17

    .line 630
    .line 631
    if-eqz v1, :cond_16

    .line 632
    .line 633
    move-object/from16 v2, v22

    .line 634
    .line 635
    invoke-virtual {v1, v2}, Lx/a;->c(Lx/l;)I

    .line 636
    .line 637
    .line 638
    move-result v10

    .line 639
    goto/16 :goto_1a

    .line 640
    .line 641
    :cond_16
    move-object/from16 v2, v22

    .line 642
    .line 643
    sub-float v1, v12, v23

    .line 644
    .line 645
    div-float v1, v1, v31

    .line 646
    .line 647
    add-float v1, v1, v23

    .line 648
    .line 649
    move v10, v1

    .line 650
    const/4 v14, 0x0

    .line 651
    goto :goto_12

    .line 652
    :cond_17
    move-object/from16 v2, v22

    .line 653
    .line 654
    if-nez v1, :cond_18

    .line 655
    .line 656
    move v12, v10

    .line 657
    move/from16 v10, v23

    .line 658
    .line 659
    goto :goto_11

    .line 660
    :cond_18
    move-object v9, v1

    .line 661
    :goto_11
    sub-float v1, v12, v10

    .line 662
    .line 663
    div-float v1, v1, v31

    .line 664
    .line 665
    add-float/2addr v1, v10

    .line 666
    move/from16 v23, v10

    .line 667
    .line 668
    move v10, v1

    .line 669
    :goto_12
    move-object/from16 v1, p2

    .line 670
    .line 671
    move v4, v0

    .line 672
    move-object/from16 v22, v2

    .line 673
    .line 674
    move-object v0, v7

    .line 675
    move/from16 v3, v21

    .line 676
    .line 677
    move/from16 v7, v35

    .line 678
    .line 679
    move-object/from16 v2, p3

    .line 680
    .line 681
    goto/16 :goto_b

    .line 682
    .line 683
    :cond_19
    move-object v7, v0

    .line 684
    move/from16 v21, v3

    .line 685
    .line 686
    move-object/from16 v2, v22

    .line 687
    .line 688
    if-nez v9, :cond_1a

    .line 689
    .line 690
    goto :goto_14

    .line 691
    :cond_1a
    invoke-virtual {v9, v2}, Lx/a;->c(Lx/l;)I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    goto/16 :goto_1a

    .line 696
    .line 697
    :cond_1b
    :goto_13
    move-object v7, v0

    .line 698
    move/from16 v21, v3

    .line 699
    .line 700
    :goto_14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 701
    .line 702
    cmpg-float v0, v13, v0

    .line 703
    .line 704
    if-gez v0, :cond_1c

    .line 705
    .line 706
    const/high16 v10, -0x1000000

    .line 707
    .line 708
    goto :goto_1a

    .line 709
    :cond_1c
    const/high16 v0, 0x42c60000    # 99.0f

    .line 710
    .line 711
    cmpl-float v0, v13, v0

    .line 712
    .line 713
    if-lez v0, :cond_1d

    .line 714
    .line 715
    const/4 v9, 0x1

    .line 716
    const/4 v10, -0x1

    .line 717
    goto :goto_1b

    .line 718
    :cond_1d
    add-float v0, v13, v20

    .line 719
    .line 720
    div-float v0, v0, v19

    .line 721
    .line 722
    const/high16 v1, 0x41000000    # 8.0f

    .line 723
    .line 724
    cmpl-float v1, v13, v1

    .line 725
    .line 726
    if-lez v1, :cond_1e

    .line 727
    .line 728
    const/4 v1, 0x1

    .line 729
    goto :goto_15

    .line 730
    :cond_1e
    const/4 v1, 0x0

    .line 731
    :goto_15
    if-eqz v1, :cond_1f

    .line 732
    .line 733
    mul-float v1, v0, v0

    .line 734
    .line 735
    mul-float/2addr v1, v0

    .line 736
    goto :goto_16

    .line 737
    :cond_1f
    div-float v1, v13, v18

    .line 738
    .line 739
    :goto_16
    mul-float v2, v0, v0

    .line 740
    .line 741
    mul-float/2addr v2, v0

    .line 742
    const v3, 0x3c111aa7

    .line 743
    .line 744
    .line 745
    cmpl-float v3, v2, v3

    .line 746
    .line 747
    if-lez v3, :cond_20

    .line 748
    .line 749
    const/4 v3, 0x1

    .line 750
    goto :goto_17

    .line 751
    :cond_20
    const/4 v3, 0x0

    .line 752
    :goto_17
    if-eqz v3, :cond_21

    .line 753
    .line 754
    move v4, v2

    .line 755
    goto :goto_18

    .line 756
    :cond_21
    mul-float v4, v0, v19

    .line 757
    .line 758
    sub-float v4, v4, v20

    .line 759
    .line 760
    div-float v4, v4, v18

    .line 761
    .line 762
    :goto_18
    if-eqz v3, :cond_22

    .line 763
    .line 764
    goto :goto_19

    .line 765
    :cond_22
    mul-float v0, v0, v19

    .line 766
    .line 767
    sub-float v0, v0, v20

    .line 768
    .line 769
    div-float v2, v0, v18

    .line 770
    .line 771
    :goto_19
    sget-object v0, Lc0/n;->d:[F

    .line 772
    .line 773
    const/4 v3, 0x0

    .line 774
    aget v9, v0, v3

    .line 775
    .line 776
    mul-float/2addr v4, v9

    .line 777
    float-to-double v3, v4

    .line 778
    const/4 v9, 0x1

    .line 779
    aget v10, v0, v9

    .line 780
    .line 781
    mul-float/2addr v1, v10

    .line 782
    float-to-double v12, v1

    .line 783
    const/4 v1, 0x2

    .line 784
    aget v0, v0, v1

    .line 785
    .line 786
    mul-float/2addr v2, v0

    .line 787
    float-to-double v0, v2

    .line 788
    move-wide/from16 v22, v3

    .line 789
    .line 790
    move-wide/from16 v24, v12

    .line 791
    .line 792
    move-wide/from16 v26, v0

    .line 793
    .line 794
    invoke-static/range {v22 .. v27}, Ly/a;->a(DDD)I

    .line 795
    .line 796
    .line 797
    move-result v10

    .line 798
    goto :goto_1b

    .line 799
    :cond_23
    move-object v7, v0

    .line 800
    move/from16 v21, v3

    .line 801
    .line 802
    :goto_1a
    const/4 v9, 0x1

    .line 803
    :goto_1b
    const v0, 0xffffff

    .line 804
    .line 805
    .line 806
    and-int/2addr v0, v10

    .line 807
    shl-int/lit8 v1, v11, 0x18

    .line 808
    .line 809
    or-int v10, v0, v1

    .line 810
    .line 811
    :goto_1c
    add-int/lit8 v0, v8, 0x1

    .line 812
    .line 813
    array-length v1, v5

    .line 814
    const/16 v2, 0x8

    .line 815
    .line 816
    if-le v0, v1, :cond_25

    .line 817
    .line 818
    const/4 v1, 0x4

    .line 819
    if-gt v8, v1, :cond_24

    .line 820
    .line 821
    move v1, v2

    .line 822
    goto :goto_1d

    .line 823
    :cond_24
    mul-int/lit8 v1, v8, 0x2

    .line 824
    .line 825
    :goto_1d
    new-array v1, v1, [I

    .line 826
    .line 827
    const/4 v3, 0x0

    .line 828
    invoke-static {v5, v3, v1, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 829
    .line 830
    .line 831
    move-object v5, v1

    .line 832
    :cond_25
    aput v10, v5, v8

    .line 833
    .line 834
    array-length v1, v6

    .line 835
    if-le v0, v1, :cond_27

    .line 836
    .line 837
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    const/4 v3, 0x4

    .line 846
    if-gt v8, v3, :cond_26

    .line 847
    .line 848
    goto :goto_1e

    .line 849
    :cond_26
    mul-int/lit8 v2, v8, 0x2

    .line 850
    .line 851
    :goto_1e
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    check-cast v1, [Ljava/lang/Object;

    .line 856
    .line 857
    const/4 v2, 0x0

    .line 858
    invoke-static {v6, v2, v1, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 859
    .line 860
    .line 861
    move-object v6, v1

    .line 862
    :cond_27
    aput-object v7, v6, v8

    .line 863
    .line 864
    check-cast v6, [[I

    .line 865
    .line 866
    move-object/from16 v1, p2

    .line 867
    .line 868
    move-object/from16 v2, p3

    .line 869
    .line 870
    move v8, v0

    .line 871
    move v4, v9

    .line 872
    move/from16 v3, v21

    .line 873
    .line 874
    const/4 v7, 0x0

    .line 875
    move-object/from16 v0, p0

    .line 876
    .line 877
    goto/16 :goto_0

    .line 878
    .line 879
    :cond_28
    :goto_1f
    move/from16 v21, v3

    .line 880
    .line 881
    move v9, v4

    .line 882
    move-object/from16 v0, p0

    .line 883
    .line 884
    move-object/from16 v1, p2

    .line 885
    .line 886
    move-object/from16 v2, p3

    .line 887
    .line 888
    move v4, v9

    .line 889
    move/from16 v3, v21

    .line 890
    .line 891
    const/4 v7, 0x0

    .line 892
    goto/16 :goto_0

    .line 893
    .line 894
    :cond_29
    new-array v0, v8, [I

    .line 895
    .line 896
    new-array v1, v8, [[I

    .line 897
    .line 898
    const/4 v2, 0x0

    .line 899
    invoke-static {v5, v2, v0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 900
    .line 901
    .line 902
    invoke-static {v6, v2, v1, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 903
    .line 904
    .line 905
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 906
    .line 907
    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 908
    .line 909
    .line 910
    return-object v2

    .line 911
    :cond_2a
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 912
    .line 913
    new-instance v1, Ljava/lang/StringBuilder;

    .line 914
    .line 915
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 916
    .line 917
    .line 918
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    .line 924
    .line 925
    const-string v2, ": invalid color state list tag "

    .line 926
    .line 927
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    throw v0
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
