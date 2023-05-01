.class public final Lh3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh3/j$a;
    }
.end annotation


# instance fields
.field public final a:[Lh3/l;

.field public final b:[Landroid/graphics/Matrix;

.field public final c:[Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/PointF;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Path;

.field public final g:Lh3/l;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Path;

.field public final l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Lh3/l;

    iput-object v1, p0, Lh3/j;->a:[Lh3/l;

    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, Lh3/j;->b:[Landroid/graphics/Matrix;

    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, Lh3/j;->c:[Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lh3/j;->d:Landroid/graphics/PointF;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lh3/j;->e:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lh3/j;->f:Landroid/graphics/Path;

    new-instance v1, Lh3/l;

    invoke-direct {v1}, Lh3/l;-><init>()V

    iput-object v1, p0, Lh3/j;->g:Lh3/l;

    const/4 v1, 0x2

    new-array v2, v1, [F

    iput-object v2, p0, Lh3/j;->h:[F

    new-array v1, v1, [F

    iput-object v1, p0, Lh3/j;->i:[F

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lh3/j;->j:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lh3/j;->k:Landroid/graphics/Path;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lh3/j;->l:Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lh3/j;->a:[Lh3/l;

    new-instance v3, Lh3/l;

    invoke-direct {v3}, Lh3/l;-><init>()V

    aput-object v3, v2, v1

    iget-object v2, p0, Lh3/j;->b:[Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    iget-object v2, p0, Lh3/j;->c:[Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lh3/i;FLandroid/graphics/RectF;Lh3/f$a;Landroid/graphics/Path;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Path;->rewind()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v0, Lh3/j;->e:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 19
    .line 20
    .line 21
    iget-object v7, v0, Lh3/j;->f:Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-virtual {v7}, Landroid/graphics/Path;->rewind()V

    .line 24
    .line 25
    .line 26
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 27
    .line 28
    invoke-virtual {v7, v3, v8}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    :goto_0
    const/4 v10, 0x2

    .line 33
    const/4 v12, 0x4

    .line 34
    const/4 v13, 0x1

    .line 35
    iget-object v14, v0, Lh3/j;->c:[Landroid/graphics/Matrix;

    .line 36
    .line 37
    iget-object v15, v0, Lh3/j;->h:[F

    .line 38
    .line 39
    iget-object v8, v0, Lh3/j;->b:[Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget-object v11, v0, Lh3/j;->a:[Lh3/l;

    .line 42
    .line 43
    if-ge v9, v12, :cond_9

    .line 44
    .line 45
    if-eq v9, v13, :cond_2

    .line 46
    .line 47
    if-eq v9, v10, :cond_1

    .line 48
    .line 49
    const/4 v12, 0x3

    .line 50
    if-eq v9, v12, :cond_0

    .line 51
    .line 52
    iget-object v12, v1, Lh3/i;->f:Lh3/c;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    iget-object v12, v1, Lh3/i;->e:Lh3/c;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object v12, v1, Lh3/i;->h:Lh3/c;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget-object v12, v1, Lh3/i;->g:Lh3/c;

    .line 62
    .line 63
    :goto_1
    if-eq v9, v13, :cond_5

    .line 64
    .line 65
    if-eq v9, v10, :cond_4

    .line 66
    .line 67
    const/4 v10, 0x3

    .line 68
    if-eq v9, v10, :cond_3

    .line 69
    .line 70
    iget-object v10, v1, Lh3/i;->b:La1/f0;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iget-object v10, v1, Lh3/i;->a:La1/f0;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    iget-object v10, v1, Lh3/i;->d:La1/f0;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    iget-object v10, v1, Lh3/i;->c:La1/f0;

    .line 80
    .line 81
    :goto_2
    aget-object v13, v11, v9

    .line 82
    .line 83
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-interface {v12, v3}, Lh3/c;->a(Landroid/graphics/RectF;)F

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-virtual {v10, v2, v12, v13}, La1/f0;->f(FFLh3/l;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v10, v9, 0x1

    .line 94
    .line 95
    rem-int/lit8 v12, v10, 0x4

    .line 96
    .line 97
    mul-int/lit8 v12, v12, 0x5a

    .line 98
    .line 99
    int-to-float v12, v12

    .line 100
    aget-object v13, v8, v9

    .line 101
    .line 102
    invoke-virtual {v13}, Landroid/graphics/Matrix;->reset()V

    .line 103
    .line 104
    .line 105
    iget-object v13, v0, Lh3/j;->d:Landroid/graphics/PointF;

    .line 106
    .line 107
    move/from16 v19, v10

    .line 108
    .line 109
    const/4 v10, 0x1

    .line 110
    if-eq v9, v10, :cond_8

    .line 111
    .line 112
    const/4 v10, 0x2

    .line 113
    if-eq v9, v10, :cond_7

    .line 114
    .line 115
    const/4 v10, 0x3

    .line 116
    if-eq v9, v10, :cond_6

    .line 117
    .line 118
    iget v10, v3, Landroid/graphics/RectF;->right:F

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    iget v10, v3, Landroid/graphics/RectF;->left:F

    .line 122
    .line 123
    :goto_3
    move/from16 v17, v10

    .line 124
    .line 125
    iget v10, v3, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_7
    iget v10, v3, Landroid/graphics/RectF;->left:F

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    iget v10, v3, Landroid/graphics/RectF;->right:F

    .line 132
    .line 133
    :goto_4
    move/from16 v17, v10

    .line 134
    .line 135
    iget v10, v3, Landroid/graphics/RectF;->bottom:F

    .line 136
    .line 137
    :goto_5
    move v3, v10

    .line 138
    move/from16 v10, v17

    .line 139
    .line 140
    invoke-virtual {v13, v10, v3}, Landroid/graphics/PointF;->set(FF)V

    .line 141
    .line 142
    .line 143
    aget-object v3, v8, v9

    .line 144
    .line 145
    iget v10, v13, Landroid/graphics/PointF;->x:F

    .line 146
    .line 147
    iget v13, v13, Landroid/graphics/PointF;->y:F

    .line 148
    .line 149
    invoke-virtual {v3, v10, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 150
    .line 151
    .line 152
    aget-object v3, v8, v9

    .line 153
    .line 154
    invoke-virtual {v3, v12}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 155
    .line 156
    .line 157
    aget-object v3, v11, v9

    .line 158
    .line 159
    iget v10, v3, Lh3/l;->c:F

    .line 160
    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    aput v10, v15, v16

    .line 164
    .line 165
    iget v3, v3, Lh3/l;->d:F

    .line 166
    .line 167
    const/4 v10, 0x1

    .line 168
    aput v3, v15, v10

    .line 169
    .line 170
    aget-object v3, v8, v9

    .line 171
    .line 172
    invoke-virtual {v3, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 173
    .line 174
    .line 175
    aget-object v3, v14, v9

    .line 176
    .line 177
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 178
    .line 179
    .line 180
    aget-object v3, v14, v9

    .line 181
    .line 182
    aget v8, v15, v16

    .line 183
    .line 184
    aget v10, v15, v10

    .line 185
    .line 186
    invoke-virtual {v3, v8, v10}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 187
    .line 188
    .line 189
    aget-object v3, v14, v9

    .line 190
    .line 191
    invoke-virtual {v3, v12}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 192
    .line 193
    .line 194
    move-object/from16 v3, p3

    .line 195
    .line 196
    move/from16 v9, v19

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_9
    move v10, v13

    .line 201
    const/16 v16, 0x0

    .line 202
    .line 203
    move/from16 v3, v16

    .line 204
    .line 205
    :goto_6
    if-ge v3, v12, :cond_13

    .line 206
    .line 207
    aget-object v9, v11, v3

    .line 208
    .line 209
    iget v13, v9, Lh3/l;->a:F

    .line 210
    .line 211
    aput v13, v15, v16

    .line 212
    .line 213
    iget v9, v9, Lh3/l;->b:F

    .line 214
    .line 215
    aput v9, v15, v10

    .line 216
    .line 217
    aget-object v9, v8, v3

    .line 218
    .line 219
    invoke-virtual {v9, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 220
    .line 221
    .line 222
    if-nez v3, :cond_a

    .line 223
    .line 224
    aget v9, v15, v16

    .line 225
    .line 226
    aget v13, v15, v10

    .line 227
    .line 228
    invoke-virtual {v5, v9, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 229
    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_a
    aget v9, v15, v16

    .line 233
    .line 234
    aget v13, v15, v10

    .line 235
    .line 236
    invoke-virtual {v5, v9, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 237
    .line 238
    .line 239
    :goto_7
    aget-object v9, v11, v3

    .line 240
    .line 241
    aget-object v10, v8, v3

    .line 242
    .line 243
    invoke-virtual {v9, v10, v5}, Lh3/l;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 244
    .line 245
    .line 246
    if-eqz v4, :cond_b

    .line 247
    .line 248
    aget-object v9, v11, v3

    .line 249
    .line 250
    aget-object v10, v8, v3

    .line 251
    .line 252
    iget-object v13, v4, Lh3/f$a;->a:Lh3/f;

    .line 253
    .line 254
    iget-object v12, v13, Lh3/f;->e:Ljava/util/BitSet;

    .line 255
    .line 256
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    const/4 v4, 0x0

    .line 260
    invoke-virtual {v12, v3, v4}, Ljava/util/BitSet;->set(IZ)V

    .line 261
    .line 262
    .line 263
    iget v4, v9, Lh3/l;->f:F

    .line 264
    .line 265
    invoke-virtual {v9, v4}, Lh3/l;->b(F)V

    .line 266
    .line 267
    .line 268
    new-instance v4, Landroid/graphics/Matrix;

    .line 269
    .line 270
    invoke-direct {v4, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 271
    .line 272
    .line 273
    new-instance v10, Ljava/util/ArrayList;

    .line 274
    .line 275
    iget-object v9, v9, Lh3/l;->h:Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 278
    .line 279
    .line 280
    new-instance v9, Lh3/k;

    .line 281
    .line 282
    invoke-direct {v9, v10, v4}, Lh3/k;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 283
    .line 284
    .line 285
    iget-object v4, v13, Lh3/f;->c:[Lh3/l$f;

    .line 286
    .line 287
    aput-object v9, v4, v3

    .line 288
    .line 289
    :cond_b
    add-int/lit8 v4, v3, 0x1

    .line 290
    .line 291
    rem-int/lit8 v9, v4, 0x4

    .line 292
    .line 293
    aget-object v10, v11, v3

    .line 294
    .line 295
    iget v12, v10, Lh3/l;->c:F

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    aput v12, v15, v13

    .line 299
    .line 300
    iget v10, v10, Lh3/l;->d:F

    .line 301
    .line 302
    const/4 v12, 0x1

    .line 303
    aput v10, v15, v12

    .line 304
    .line 305
    aget-object v10, v8, v3

    .line 306
    .line 307
    invoke-virtual {v10, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 308
    .line 309
    .line 310
    aget-object v10, v11, v9

    .line 311
    .line 312
    iget v12, v10, Lh3/l;->a:F

    .line 313
    .line 314
    move/from16 v20, v4

    .line 315
    .line 316
    iget-object v4, v0, Lh3/j;->i:[F

    .line 317
    .line 318
    aput v12, v4, v13

    .line 319
    .line 320
    iget v10, v10, Lh3/l;->b:F

    .line 321
    .line 322
    const/4 v12, 0x1

    .line 323
    aput v10, v4, v12

    .line 324
    .line 325
    aget-object v10, v8, v9

    .line 326
    .line 327
    invoke-virtual {v10, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 328
    .line 329
    .line 330
    aget v10, v15, v13

    .line 331
    .line 332
    aget v18, v4, v13

    .line 333
    .line 334
    sub-float v10, v10, v18

    .line 335
    .line 336
    move-object v13, v6

    .line 337
    float-to-double v5, v10

    .line 338
    aget v10, v15, v12

    .line 339
    .line 340
    aget v4, v4, v12

    .line 341
    .line 342
    sub-float/2addr v10, v4

    .line 343
    move-object v4, v13

    .line 344
    float-to-double v12, v10

    .line 345
    invoke-static {v5, v6, v12, v13}, Ljava/lang/Math;->hypot(DD)D

    .line 346
    .line 347
    .line 348
    move-result-wide v5

    .line 349
    double-to-float v5, v5

    .line 350
    const v6, 0x3a83126f    # 0.001f

    .line 351
    .line 352
    .line 353
    sub-float/2addr v5, v6

    .line 354
    const/4 v6, 0x0

    .line 355
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    aget-object v10, v11, v3

    .line 360
    .line 361
    iget v12, v10, Lh3/l;->c:F

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    aput v12, v15, v13

    .line 365
    .line 366
    iget v10, v10, Lh3/l;->d:F

    .line 367
    .line 368
    const/4 v12, 0x1

    .line 369
    aput v10, v15, v12

    .line 370
    .line 371
    aget-object v10, v8, v3

    .line 372
    .line 373
    invoke-virtual {v10, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 374
    .line 375
    .line 376
    if-eq v3, v12, :cond_c

    .line 377
    .line 378
    const/4 v10, 0x3

    .line 379
    if-eq v3, v10, :cond_c

    .line 380
    .line 381
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    aget v13, v15, v12

    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    const/4 v12, 0x0

    .line 393
    aget v13, v15, v12

    .line 394
    .line 395
    :goto_8
    sub-float/2addr v10, v13

    .line 396
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 397
    .line 398
    .line 399
    move-result v10

    .line 400
    const/high16 v12, 0x43870000    # 270.0f

    .line 401
    .line 402
    iget-object v13, v0, Lh3/j;->g:Lh3/l;

    .line 403
    .line 404
    invoke-virtual {v13, v6, v12, v6}, Lh3/l;->e(FFF)V

    .line 405
    .line 406
    .line 407
    const/4 v6, 0x1

    .line 408
    if-eq v3, v6, :cond_f

    .line 409
    .line 410
    const/4 v6, 0x2

    .line 411
    if-eq v3, v6, :cond_e

    .line 412
    .line 413
    const/4 v12, 0x3

    .line 414
    if-eq v3, v12, :cond_d

    .line 415
    .line 416
    iget-object v6, v1, Lh3/i;->j:Lh3/e;

    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_d
    iget-object v6, v1, Lh3/i;->i:Lh3/e;

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_e
    const/4 v12, 0x3

    .line 423
    iget-object v6, v1, Lh3/i;->l:Lh3/e;

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_f
    const/4 v12, 0x3

    .line 427
    iget-object v6, v1, Lh3/i;->k:Lh3/e;

    .line 428
    .line 429
    :goto_9
    invoke-virtual {v6, v5, v10, v2, v13}, Lh3/e;->a(FFFLh3/l;)V

    .line 430
    .line 431
    .line 432
    iget-object v5, v0, Lh3/j;->j:Landroid/graphics/Path;

    .line 433
    .line 434
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 435
    .line 436
    .line 437
    aget-object v6, v14, v3

    .line 438
    .line 439
    invoke-virtual {v13, v6, v5}, Lh3/l;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 440
    .line 441
    .line 442
    iget-boolean v6, v0, Lh3/j;->l:Z

    .line 443
    .line 444
    if-eqz v6, :cond_11

    .line 445
    .line 446
    invoke-virtual {v0, v5, v3}, Lh3/j;->b(Landroid/graphics/Path;I)Z

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    if-nez v6, :cond_10

    .line 451
    .line 452
    invoke-virtual {v0, v5, v9}, Lh3/j;->b(Landroid/graphics/Path;I)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_11

    .line 457
    .line 458
    :cond_10
    sget-object v6, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 459
    .line 460
    invoke-virtual {v5, v5, v7, v6}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 461
    .line 462
    .line 463
    iget v5, v13, Lh3/l;->a:F

    .line 464
    .line 465
    const/4 v6, 0x0

    .line 466
    aput v5, v15, v6

    .line 467
    .line 468
    iget v5, v13, Lh3/l;->b:F

    .line 469
    .line 470
    const/4 v9, 0x1

    .line 471
    aput v5, v15, v9

    .line 472
    .line 473
    aget-object v5, v14, v3

    .line 474
    .line 475
    invoke-virtual {v5, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 476
    .line 477
    .line 478
    aget v5, v15, v6

    .line 479
    .line 480
    aget v6, v15, v9

    .line 481
    .line 482
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 483
    .line 484
    .line 485
    aget-object v5, v14, v3

    .line 486
    .line 487
    invoke-virtual {v13, v5, v4}, Lh3/l;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 488
    .line 489
    .line 490
    move-object/from16 v5, p4

    .line 491
    .line 492
    move-object/from16 v6, p5

    .line 493
    .line 494
    goto :goto_a

    .line 495
    :cond_11
    const/4 v9, 0x1

    .line 496
    aget-object v5, v14, v3

    .line 497
    .line 498
    move-object/from16 v6, p5

    .line 499
    .line 500
    invoke-virtual {v13, v5, v6}, Lh3/l;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 501
    .line 502
    .line 503
    move-object/from16 v5, p4

    .line 504
    .line 505
    :goto_a
    if-eqz v5, :cond_12

    .line 506
    .line 507
    aget-object v10, v14, v3

    .line 508
    .line 509
    iget-object v9, v5, Lh3/f$a;->a:Lh3/f;

    .line 510
    .line 511
    iget-object v12, v9, Lh3/f;->e:Ljava/util/BitSet;

    .line 512
    .line 513
    add-int/lit8 v0, v3, 0x4

    .line 514
    .line 515
    const/4 v1, 0x0

    .line 516
    invoke-virtual {v12, v0, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 517
    .line 518
    .line 519
    iget v0, v13, Lh3/l;->f:F

    .line 520
    .line 521
    invoke-virtual {v13, v0}, Lh3/l;->b(F)V

    .line 522
    .line 523
    .line 524
    new-instance v0, Landroid/graphics/Matrix;

    .line 525
    .line 526
    invoke-direct {v0, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 527
    .line 528
    .line 529
    new-instance v10, Ljava/util/ArrayList;

    .line 530
    .line 531
    iget-object v12, v13, Lh3/l;->h:Ljava/util/ArrayList;

    .line 532
    .line 533
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 534
    .line 535
    .line 536
    new-instance v12, Lh3/k;

    .line 537
    .line 538
    invoke-direct {v12, v10, v0}, Lh3/k;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 539
    .line 540
    .line 541
    iget-object v0, v9, Lh3/f;->d:[Lh3/l$f;

    .line 542
    .line 543
    aput-object v12, v0, v3

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_12
    const/4 v1, 0x0

    .line 547
    :goto_b
    move-object/from16 v0, p0

    .line 548
    .line 549
    move/from16 v16, v1

    .line 550
    .line 551
    move/from16 v3, v20

    .line 552
    .line 553
    const/4 v10, 0x1

    .line 554
    const/4 v12, 0x4

    .line 555
    move-object/from16 v1, p1

    .line 556
    .line 557
    move-object/from16 v21, v6

    .line 558
    .line 559
    move-object v6, v4

    .line 560
    move-object v4, v5

    .line 561
    move-object/from16 v5, v21

    .line 562
    .line 563
    goto/16 :goto_6

    .line 564
    .line 565
    :cond_13
    move-object v4, v6

    .line 566
    move-object v6, v5

    .line 567
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Path;->close()V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v4}, Landroid/graphics/Path;->isEmpty()Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-nez v0, :cond_14

    .line 578
    .line 579
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 580
    .line 581
    invoke-virtual {v6, v4, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 582
    .line 583
    .line 584
    :cond_14
    return-void
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

.method public final b(Landroid/graphics/Path;I)Z
    .locals 3

    iget-object v0, p0, Lh3/j;->k:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v1, p0, Lh3/j;->a:[Lh3/l;

    aget-object v1, v1, p2

    iget-object v2, p0, Lh3/j;->b:[Landroid/graphics/Matrix;

    aget-object p2, v2, p2

    invoke-virtual {v1, p2, v0}, Lh3/l;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method
